import java.util.Scanner;

/*
 5、计算今天是星期几
（1）定义变量week赋值为上一年最后一天的星期值，例如：2021年12月31日的星期值5，
（2）定义变量year、month、day，分别赋值今年（例如：2022年）某一天的年、月、日值。
（3）计算这一天是星期几。
（4）开发提示
- 需要计算这一天是今年（例如：2022年）的第几天，即今年已经过了几天了（总天数）
- 再用（总天数 + 5 ）% 7 的结果来判断是星期几
（5）每个月总天数：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
（6）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = input.nextInt();

        System.out.print("请输入月份:");
        int month = input.nextInt();

        System.out.print("请输入今天是本月的多少号:");
        int day = input.nextInt();

        System.out.print("请输入上一年最后一天是星期几:");
        int week = input.nextInt();

        int month2 = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) ? 29 : 28 ;

        int sumDay = 0;
        switch(month){
            case 12:
                sumDay += 30;//11月份的总天数
            case 11:
                sumDay += 31;//10月份的总天数
            case 10:
                sumDay += 30;//9月份的总天数
            case 9:
                sumDay += 31;//8月份的总天数
            case 8:
                sumDay += 31;//7月份的总天数
            case 7:
                sumDay += 30;//6月份的总天数
            case 6:
                sumDay += 31;//5月份的总天数
            case 5:
                sumDay += 30;//4月份的总天数
            case 4:
                sumDay += 31;//3月份的总天数
            case 3:
                sumDay += month2;//2月份的总天数
            case 2:
                sumDay += 31;//1月份的总天数
            case 1:
                sumDay += day;
            default:
                System.out.println("输入有误");


        }
        week = (sumDay + week) % 7;
        System.out.println("今天是星期" + ((week == 0) ? "日" : week));
    input.close();
    }
}
