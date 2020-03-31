import java.io.ByteArrayInputStream

import com.beanit.jasn1.compiler.cdrf.r9.CallEventRecord
import hadoopIO.AsnInputFormat
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.io.{LongWritable, Text}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession


object SparkApp {
  def main(args: Array[String]): Unit = {

    val path = "src\\main\\resources\\sample_file.ber"
    val sparkSession =SparkSession
      .builder()
      .appName("test_Session")
      .master("local[*]")
      .getOrCreate()

    val conf: Configuration = new Configuration(sparkSession.sqlContext.sparkContext.hadoopConfiguration)

    //conf.setInt("mapred.max.split.size", 4000)  : To test parallelism

    val fileRDD: RDD[(LongWritable, Text)] = sparkSession.sqlContext.sparkContext
      .newAPIHadoopFile(path, classOf[AsnInputFormat], classOf[LongWritable], classOf[Text], conf)
    val cer = new CallEventRecord

    fileRDD.map(x=>new ByteArrayInputStream(x._2.getBytes))
      .map(x=>{
        cer.decode(x)
        cer
      }).collect().foreach(x=>println(x))

  }
}
