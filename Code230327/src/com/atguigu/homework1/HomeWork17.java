package com.atguigu.homework1;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/28/2023 6:07 PM
 */
public class HomeWork17 {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String  args[]){
        HomeWork17 ex = new HomeWork17();
        ex.change(ex.str,ex.ch);
        // goodand 字符串作为形参,调用方法改变后,不影响原有的值
        System.out.print(ex.str + "and");
          //gbc
        System.out.print(ex.ch);

    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
