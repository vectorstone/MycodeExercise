package com.atguigu.inheritance.homework2;

/**
 * @Description: 测试类
 * @Author: Gavin
 * @Date: 3/20/2023 6:58 PM
 */
public class HomeWorkTest {
    public static void main(String[] args) {
        final int EMPLOYEE = 10;//表示普通员工
        final int PROGRAMMER = 11;//表示程序员
        final int DESIGNER = 12;//表示设计师
        final int ARCHITECT = 13;//表示架构师

        String[][] EMPLOYEES = {
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800","5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };

        //是不是想让我们安装上述数组,创建对应的员工对象,再存放到数组中
        Employee[] all = new Employee[EMPLOYEES.length];

        for (int i = 0; i < EMPLOYEES.length; i++) {
            int number = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            if (Integer.parseInt(EMPLOYEES[i][0]) == 10){
                all[i] = new Employee(number,name,age,salary);
            }else if (Integer.parseInt(EMPLOYEES[i][0]) == 11){
                all[i] = new Programmer(number,name,age,salary,"java");
            }else if(Integer.parseInt(EMPLOYEES[i][0]) == 12){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                all[i] = new Designer(number,name,age,salary,"java",bonus);
            }else if(Integer.parseInt(EMPLOYEES[i][0]) == 13){
                double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                int stock = Integer.parseInt(EMPLOYEES[i][6]);
                all[i] = new Architect(number,name,age,salary,"java",bonus,stock);
            }
        }
        System.out.println("编号" +"\t"+ "姓名"+"\t"+"年龄"+"\t"+ "薪资"+"\t"+ "奖金" +"\t"+ "股票");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
        }
    }
}
