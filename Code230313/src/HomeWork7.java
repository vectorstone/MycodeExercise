/*
7、判断打鱼还是晒网
（1）从键盘输入年、月、日，
（2）假设从这一年的1月1日开始执行三天打鱼两天晒网，那么你输入的这一天是在打鱼还是晒网。
（3）开发提示：
- 先计算这一天是这一年的第几天，即总天数
- 再用总天数 % 5（三天打鱼两天晒网的周期），根据结果来判断是打鱼还是晒网
（4）每个月总天数：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
（5）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除
 */

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year,month,day;
        while(true){
            System.out.print("请输入年份:");
            year = input.nextInt();
            if (year > 0) break;
            else System.out.println("您输入的年份不正确,请重新输入:");
        }

        while(true){
            System.out.print("请输入月份:");
            month = input.nextInt();
            if (month >= 1 && month <=12) break;
            else System.out.println("您输入的月份不合法");
        }
        int month2 = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;

        while(true){
            System.out.print("请输入日期:");
            day = input.nextInt();
            int x = 30;
            if(month == 1 || month == 3 || month ==5 || month == 7 || month == 8 || month == 10 || month == 12){
                x = 31;
            }else {
                x = month2;
            }
            if (day > x || day < 1) System.out.println("您输入的日期不合法");
            else break;
        }





        //计算总天数
        int sumDay = 0;

            switch(month){
                case 12:
                    sumDay += 30;//11
                case 11:
                    sumDay += 31;//10
                case 10:
                    sumDay += 30;//9
                case 9:
                    sumDay += 31;//8
                case 8:
                    sumDay += 31;//7
                case 7:
                    sumDay += 30;//6
                case 6:
                    sumDay += 31;//5
                case 5:
                    sumDay += 30;//4
                case 4:
                    sumDay += 31;//3
                case 3:
                    sumDay += month2;//2
                case 2:
                    sumDay += 31;//1
                case 1:
                    sumDay += day;

            }

            int day2 = sumDay % 5;

            if(day2 >= 1 && day2 <= 3 ) System.out.println("今天应该打鱼");
            else System.out.println("今天应该晒网");




        input.close();
    }
}
