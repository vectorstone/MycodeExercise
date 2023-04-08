package com.atguigu.exercise.homework12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 7:00 PM
 */
public class HomeWork13 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/JavaDevelop/test");
        //先复制文件
        copyDir(f);
        //再删除源文件夹
        delete(f);
    }
    public static void delete(File file){
        if(file.isFile()){
            file.delete();
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                delete(file1);
            }
            file.delete();
        }
    }

    public static void copyDir(File f) throws IOException {
        if (f.isFile()) {
            String desFileName = f.getPath().replace("D:\\JavaDevelop\\test", "testIO");
            File desFile = new File(desFileName);
            copyFile(f, desFile);
        } else if (f.isDirectory()) {
            String desFileName = f.getPath().replace("D:\\JavaDevelop\\test", "testIO");
            File desFile = new File(desFileName);
            // 一定要先创建文件夹
            desFile.mkdir();
            File[] files = f.listFiles();
            for (File file : files) {
                copyDir(file);
            }
        }
    }

    public static void copyFile(File src, File des) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(des);
        int length;
        byte[] arr = new byte[1024];
        while ((length = fis.read(arr)) != -1) {
            fos.write(arr, 0, length);
        }
        fis.close();
        fos.close();
    }
}
