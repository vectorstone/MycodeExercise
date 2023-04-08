package com.atguigu.exercise.homework3;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 7:05 PM
 * 复制指定路径下的文件到指定的文件夹下面
 * 要求使用缓冲流和文件流一起实现
 */
public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        //先创建当前目录下的testIO文件夹,不然输出流的时候会报错
        File f1 = new File("testIO");
        f1.mkdir();
        //普通流
        //记录开始时间
        long start = System.currentTimeMillis();
        //创建流对象
        FileInputStream fis = new FileInputStream("D:\\AtGuiGu\\07 Tutor Documents\\Day18-IO流\\note\\Day18_File类与IO流.md");
        FileOutputStream fos = new FileOutputStream("testIO/Day18_Fil类与IO流.bak.md");
        //读写数据
        byte[] data = new byte[1024];
        int len;
        while((len = fis.read(data)) != -1){
            fos.write(data,0,len);
        }

        fos.close();
        fis.close();
        //记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间:"+(end-start)+"毫秒");

        //缓冲流
        long start1 = System.currentTimeMillis();
        //创建流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\AtGuiGu\\07 Tutor Documents\\Day18-IO流\\note\\Day18_File类与IO流.md"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("testIO/Day18_File类与IO流.缓冲流.md"));
        //读写数据
        int length;
        byte[] data1 = new byte[1024];
        while ((length = bis.read(data1)) != -1){
            bos.write(data1,0,length);
        }
        bos.close();
        bis.close();
        //记录时间
        long end1 = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end1-start1)+"毫秒");
    }
}
