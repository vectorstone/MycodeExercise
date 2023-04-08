package com.atguigu.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
关闭流以及使用try...catch处理异常

close()关闭流的代码需要写到finally代码块里，保证它一定执行
 */
public class CloseDemo1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos =null;
        try {
            fis = new FileInputStream("2.txt");
            fos =  new FileOutputStream("1.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
