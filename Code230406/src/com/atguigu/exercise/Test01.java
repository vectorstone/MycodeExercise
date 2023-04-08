package com.atguigu.exercise;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/6/2023 8:13 PM
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String str = "这是一条测试语句";
        //先解码
        byte[] bytes = str.getBytes();

        //再来编码
        String s1 = new String(bytes);

        //第二种编码方式
        String s2 = new String(bytes,0,bytes.length);

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        FileWriter write = new FileWriter("testIO/testString.txt");
        write.write("s1 = "+s1);
        write.flush();

        write.write("\ns2 = "+s2);
        write.flush();
    }
}
