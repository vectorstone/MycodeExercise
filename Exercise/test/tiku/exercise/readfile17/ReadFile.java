package tiku.exercise.readfile17;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 8:59 PM
 * 写的不对,概念还是没有搞清楚
 */

public class ReadFile {
   public static void main(String[] args) throws IOException {
      //先创建一个GBK编码格式的文本文件
      FileOutputStream fiw = new FileOutputStream("GBK.txt");
      String message = "我是GBK文件";
      byte[] gbks = message.getBytes("GBK");
      int length = message.length();
      fiw.write(gbks,0,length);
      fiw.close();

      //读取GBK文件
      FileInputStream fis = new FileInputStream("GBK,txt");
      FileOutputStream fos = new FileOutputStream("UTF8.txt");
      byte[] arr = new byte[1024];
      int leth;
      while((leth=fis.read(arr))!=-1){
         fos.write(arr,0,leth);
      }
      fis.close();
      fos.close();
   }
}
