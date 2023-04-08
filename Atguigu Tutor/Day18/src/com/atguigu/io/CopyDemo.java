package com.atguigu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
使用 IO流拷贝一个文件
*/
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要备份的文件路径:");
        String filePath = scanner.next();
        scanner.close();


        FileInputStream fis = new FileInputStream(filePath);

        // 1.txt --> 1.bak.txt   1.exe --> 1.bak.exe  1.jpg-->1.bak.jpg
        // 2020.4.3.16.59.log --> 2020.4.3.16.59.bak.log
        int lastIndex = filePath.lastIndexOf(".");
        String name = filePath.substring(0, lastIndex) + ".bak" + filePath.substring(lastIndex);  // 2020.4.3.16.59.bak.log
        FileOutputStream fos = new FileOutputStream(name);

       /* int content;
        // 读取文件
        while ((content = fis.read()) != -1) {
            fos.write(content);  // 将读取到的内容写入到fos
        }*/
        long start = System.currentTimeMillis();
        int length;
        byte[] bytes = new byte[1024 * 1024 * 8];
        while ((length = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);  // 1K:3647  1M:734 8M:760
        fis.close();
        fos.close();

        /*
          时间和空间的平衡:  缓存空间小，每次消耗的内存小，每次时间快，但是次数多
          缓冲空间大，每次消耗的内存大，每次时间慢，但是次数少

          优化的方案: 以时间换空间   以空间换时间
         总时间 = 每次消耗的时间 * 总次数
         */

    }
}
