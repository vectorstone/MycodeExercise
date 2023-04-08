package com.atguigu.exercise.homework4;

import java.io.*;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 7:46 PM
 */
public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        //定义文件路径,文件为GBK编码
        String originFile = "D:\\AtGuiGu\\07 Tutor Documents\\Day18-IO流\\homework\\我想对你说.txt";
        //创建输入流对象,使用GBK编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(originFile),"GBK");

        //定义输出文件路径,文件编码为UTF_8
        String outFile = "testIO/柴老师的话.txt";
        //创建输出流对象,使用UTF-8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outFile));
        //定义变量数组,保存字符
        byte[] charData= new byte[1024];
        int length;
        while((length = isr.read()/*读取数据*/) != -1){
            //写入数据
            osw.write(length);
        }
        isr.close();
        osw.close();
    }
}
