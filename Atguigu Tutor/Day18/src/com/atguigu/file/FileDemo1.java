package com.atguigu.file;

import java.io.File;
import java.io.IOException;

/*
File的构造方法:
    File(String path): 传入一个文件路径获取到一个File对象

File里的常见方法:
    exists(): 判断文件(夹)是否存在
    isFile(): 判断是否是一个文件
    isDirectory(): 判断是否是一个文件夹
    String getAbsolutePath(): 获取到文件的绝对路径的字符串
    File getAbsoluteFile(): 获取到文件绝对路径的File对象
    getParent(): 获取到父文件夹路径字符串
    getParentFile(): 获取到父文件夹File对象
    length(): 获取文件的大小，文件夹的大小无法获取
    createNewFile(): 如果文件不存在就创建文件;如果文件已经存在，不创建
        如果文件名不合法，会抛出异常
    delete(): 用来删除文件 或者 空文件夹
    mkdir(): 用来创建一个文件  make directory
    mkdirs(): 用来创建多级文件夹


路径的使用:
    绝对路径: JavaSE本地项目里，绝对路径指的是从电脑盘符开始的路径
        C:\Users\70794\Desktop\1.txt
    相对路径: JavaSE本地项目里，相对路径指的是从 当前项目的根目录开始的路径

    路径分隔符: 用来表示下一级文件夹，可以使用 \(windows) 也可以使用  /(非windows,linux/MacOS)
    推荐使用  /     不推荐使用\ (平台; \在字符串里表示转移字符)
*/
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        int a = 10;  // 变量a 会存储在内存中

        // File f1 也会存储在内存中
        // File f1 = new File("C:\\Users\\70794\\Desktop\\1.txt");
        File f1 = new File("C:/Users/70794/Desktop/1.txt");
        System.out.println(f1.exists());
        String parentName = f1.getParent();
        File parentFile = f1.getParentFile();

        File f2 = new File("2.txt");
        System.out.println(f2.exists());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());


        File f3 = new File("out.txt");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.length());
        f3.delete();

        System.out.println(f3.getAbsoluteFile().isDirectory());
        System.out.println(f3.getAbsolutePath());

        File f4 = new File("aaa/bbb/ccc/ddd");
        boolean mkdir = f4.mkdirs();
        System.out.println("mkdir = " + mkdir);

        File f5 = new File("1.txt");
        boolean success = f5.createNewFile();
        System.out.println(success);
        boolean x = f5.delete();
        System.out.println(x);
    }
}
