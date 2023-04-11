package com.atguigu.reference;

import java.io.File;
import java.io.FileFilter;


public class MethodRefTest2 {
    public static void main(String[] args) {
        File f = new File("../");

        /*String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }*/

        //  File[] listFiles(FileFilter filter)

        /*File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File x) {
                return x.isDirectory();
            }
        });*/
        // File[] files = f.listFiles(x -> x.isFile());

        File[] files = f.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

    }
}
