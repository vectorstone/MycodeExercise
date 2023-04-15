package tiku.exercise.readfile17;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 9:27 PM
 */
public class exercise2 {
    @Test
    public void test() throws IOException {
        // 创建文件输入流
        FileInputStream fis = new FileInputStream("GBK.txt");
        // 创建字符输入流
        InputStreamReader isr = new InputStreamReader(fis, "GBK");

        // 创建文件输出流
        FileOutputStream fos = new FileOutputStream("UTF8.txt");
        // 创建字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

        // 读取文件并写入到指定的文件中
        char[] arr = new char[1024];
        int length;
        while ((length = isr.read(arr)) != -1) {
            osw.write(arr, 0, length);
        }
        isr.close();
        fis.close();

        osw.close();
        fos.close();
    }
}
