package com.atguigu.exercise.homework9;

import java.io.File;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 4:05 PM
 * 统计指定文件夹的大小
 */
public class HomeWork9 {
    public static void main(String[] args) {
        File f = new File("D:\\JavaDevelop\\test\\");
        System.out.println(f+"文件夹大小是:"+size(f)+"bytes");

    }
    public static int size(File f){
        int sum = 0;
        if(f.isFile()){
            sum += f.length();
        }else if(f.isDirectory()){
            File[] files = f.listFiles();
            for (File file : files) {
                sum += size(file);
            }

        }
        return sum;
    }
}
