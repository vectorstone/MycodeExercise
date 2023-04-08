package com.atguigu.exercise.homework10;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 4:20 PM
 * 复制《尚硅谷_190513班_柴林燕_JavaSE》到当前项目的testIO文件夹中
 */
public class HomeWork10 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:/JavaDevelop/test");
        copyDir(src);
        // File ss = new File("D:/gavin");
        /*ss.createNewFile();
        System.out.println(ss.exists());*/
        // ss.mkdir();


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
