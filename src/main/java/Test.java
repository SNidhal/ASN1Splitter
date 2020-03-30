import com.beanit.jasn1.compiler.cdrf.r9.CallEventRecord;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\main\\resources\\sample_file.ber");

        byte[] fileContent = Files.readAllBytes(file.toPath());
        InputStream is = new ByteArrayInputStream(fileContent);
        CallEventRecord cer = new CallEventRecord();

        int i =0;
        while (i != -1) {
            i =cer.decode(is);
            System.out.println("\nDecoded record:");
            System.out.println(cer);
        }


    }
}
