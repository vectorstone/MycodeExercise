package com.atguigu.homework9;

import java.util.Scanner;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/27/2023 9:17 PM
 * * 定义用户类，属性为用户名和密码。
 * * 使用数组存储多个用户对象。
 * * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
 * * 登录失败时，当用户名错误，提示没有该用户。
 * * 登录失败时，当密码错误时，提示密码有误。
 */
public class HomeWork9 {
    public static void main(String[] args) {

        Person[] arr = {
                new Person("jack", "123456"),
                new Person("tom", "8794534"),
                new Person("jerry", "qwertyuio"),
                new Person("gavin", "qazwsxedc"),
                new Person("peek", "mcvnghfjk")
        };
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String Name = input.nextLine();
        System.out.print("请输入密码:");
        String Password = input.nextLine();
        input.close();

        boolean nameResult = false;
        boolean passwordResult = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName().equals(Name)){
                nameResult = true;
                if(arr[i].getPassword().equals(Password)){
                    passwordResult = true;
                }else {
                    passwordResult = false;
                }
            }
        }
        if(nameResult && passwordResult){
            System.out.println("登录结果:登录成功");
        }else if(nameResult){
            System.out.println("登录结果:密码错误");
        }else{
            System.out.println("登录结果:用户名错误");
        }
    }
}
