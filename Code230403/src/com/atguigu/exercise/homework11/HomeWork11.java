package com.atguigu.exercise.homework11;

import java.io.File;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/5/2023 6:51 PM
 * 删除当前目录下的testIO文件夹
 * 慎用
 */
public class HomeWork11 {
    public static void main(String[] args) {
        File f = new File("testIO");
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
}
