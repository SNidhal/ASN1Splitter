package hadoopIO;

import com.beanit.jasn1.ber.BerLength;
import com.beanit.jasn1.ber.BerTag;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AsnRecordReader extends RecordReader<LongWritable, Text> {

    private Path filePath;
    private FSDataInputStream fileSystemInputStream;
    private long blockStartPosition, blockEndPosition, currentPosition = 0;
    private LongWritable currentKey = new LongWritable();
    private Text currentValue = new Text();

    @Override
    public boolean nextKeyValue() throws IOException {
        currentKey.set(currentPosition);
        currentValue.clear();

        int codeLength = 0;
        long recordEndPosition = currentPosition;
        BerTag berTag = new BerTag();
        codeLength += berTag.decode(fileSystemInputStream);

        BerLength length = new BerLength();

        codeLength += length.decode(fileSystemInputStream);

        recordEndPosition = recordEndPosition + codeLength + length.val;

        while (currentPosition < recordEndPosition) {
            int recordByte = 0;
            fileSystemInputStream.seek(currentPosition);
            recordByte = fileSystemInputStream.readByte();

            byte[] b = {(byte) recordByte};
            currentValue.append(b, 0, 1);

            currentPosition++;

        }

        return currentPosition < blockEndPosition;
    }

    @Override
    public LongWritable getCurrentKey() {
        return currentKey;
    }

    @Override
    public Text getCurrentValue() {
        return currentValue;
    }

    @Override
    public float getProgress() {
        if (blockStartPosition == blockEndPosition) {
            return 0.0f;
        } else {
            return Math.min(1.0f, (currentPosition - blockStartPosition) / (float) (blockEndPosition - blockStartPosition));
        }
    }

    @Override
    public void initialize(InputSplit split, TaskAttemptContext context)
            throws IOException {

        Configuration conf = context.getConfiguration();

        FileSplit localFileBlock = (FileSplit) split;
        blockStartPosition = localFileBlock.getStart();
        blockEndPosition = blockStartPosition + localFileBlock.getLength();
        filePath = ((FileSplit) split).getPath();
        FileSystem fileSystem = filePath.getFileSystem(conf);
        fileSystemInputStream = fileSystem.open(filePath);
        if (blockStartPosition != 0) {
            fileSystemInputStream.seek(blockStartPosition);
            blockStartPosition = findRecordStart(fileSystemInputStream, blockStartPosition, blockEndPosition);
            if (blockStartPosition != -1) fileSystemInputStream.seek(blockStartPosition);
            else blockStartPosition = blockEndPosition;
        }
        currentPosition = blockStartPosition;
    }

    @Override
    public void close() throws IOException {
        if (fileSystemInputStream != null) fileSystemInputStream.close();
    }


    private long findRecordStart(FSDataInputStream fileSystemInputStream, long blockStartPosition, long blockEndPosition) throws IOException {

        for (long position = blockStartPosition; position < blockEndPosition; position++) {
            fileSystemInputStream.seek(position);
            BerTag berTag = new BerTag();
            berTag.decode(fileSystemInputStream);
            ArrayList<Integer> tagRef = new ArrayList<>(Arrays.asList(78, 79));//,77,76,70,27,26,25,24,23,22,21,20));
            if (berTag.tagClass == 128 && berTag.primitive == 32 && tagRef.contains(berTag.tagNumber)) return position;
        }
        return -1;
    }

}
