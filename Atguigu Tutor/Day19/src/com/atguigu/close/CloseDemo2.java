package com.atguigu.close;

import com.atguigu.tools.IOUtils;

import java.io.*;

/*
自定义 IOUtils类简化关闭流的代码
 */
public class CloseDemo2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileReader reader = null;
        FileWriter writer = null;
        try {
            fis = new FileInputStream("2.txt");
            fos = new FileOutputStream("1.txt");
            reader = new FileReader("1.txt");
            writer = new FileWriter("5.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*IOUtils.close(fis);
            IOUtils.close(fos);
            IOUtils.close(reader);
            IOUtils.close(writer);*/

            IOUtils.close(fis,fos,reader,writer);
        }
    }
}
