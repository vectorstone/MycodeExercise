package com.atguigu.exercise;

import java.io.File;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/3/2023 11:46 AM
 */
public class Test {
    public static void main(String[] args) {
        File f1 = new File("D:/www/text.txt");
        f1.exists();
        System.out.println(f1.exists());
        System.out.println(f1.length());
        char x = 'x';
        int i = 10;
        System.out.println(true? x : i);

        for (int j = 0; j < 3; j++) {
            int a = 10;
        }

    }
}




