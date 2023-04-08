package com.atguigu.exercise.homework8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 7:00 PM
 * 获取D盘atguigu文件夹下的所有.java文件
 * 不包含子文件夹
 * 包含子文件夹
 */
public class HomeWork8 {
    public static void main(String[] args) {
        File f = new File("D:/JavaDevelop/test");
        //递归获取所有的.java文件
        List<File> allSub = getAllSub(f);
        for (File file : allSub) {
            System.out.println(file);
        }
        System.out.println("--------------------------");
        //不包含子文件夹
        List<File> ff = new ArrayList<>();
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.getName().contains(".java")){
                ff.add(file);
            }
        }
        for (File file : ff) {
            System.out.println(file);
        }


    }

        public static List<File> getAllSub(File file){
        List<File> list = new ArrayList<>();
        if(file.isFile()){
            if(file.getName().contains(".java")){
                list.add(file);
            }
        }else if(file.isDirectory()){
            File[] fs = file.listFiles();
            for (File f : fs) {
                list.addAll(getAllSub(f));
            }
        }
        return list;
        }
    }


