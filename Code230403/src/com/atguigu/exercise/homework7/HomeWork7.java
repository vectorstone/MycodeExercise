package com.atguigu.exercise.homework7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/4/2023 6:45 PM
 */
public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        PrintStream ps = new PrintStream("testIO/words.txt");
        System.out.print("请输入第一句话:");
        ps.println(input.next());
        System.out.print("请输入第二句话:");
        ps.println(input.next());
        System.out.print("请输入第三句话");
        ps.println(input.next());
        ps.close();
        input.close();

        FileInputStream fis = new FileInputStream("testIO/words.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
        fis.close();

    }
}
