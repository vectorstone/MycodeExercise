package com.atguigu.homework6;

/**
 * @Description: 测试类
 * @Author: Gavin
 * @Date: 3/18/2023 10:31 PM
 * 创建几个家庭成员测试一下
 */
public class HomeWork6 {
    public static void main(String[] args) {
        //创建成员
        Citizen father = new Citizen("王xx","12348943212");
        Citizen mother = new Citizen("熊xx","9883423424342");
        Citizen me = new Citizen("王小广","33434231212");

        //先设置生日
        father.setBirthday(1972,8,10);
        mother.setBirthday(1972,5,15);
        me.setBirthday(1995,12,8);

        //输出打印
        System.out.println(father.getInfo());
        System.out.println(mother.getInfo());
        System.out.println(me.getInfo());
    }
}
