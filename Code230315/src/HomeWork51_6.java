import java.util.Scanner;

/*
假设张三从1990年1月1日开始执行三天打鱼两天晒网，5天一个周期，风雨无阻，
那么李四想要找张三玩，需要从键盘输入年，月，日后，判断这一天张三是在打鱼还是晒网。
开发提示：
（1）先用两个数组分别存储平年和闰年每个月总天数：
- 使用数组1存储平年的总天数和12个月的总天数
- 使用数组2存储闰年的总天数和12个月的总天数
（2）再算从1990年1月1日到year年month月day日的总天数
1. [1990, year-1]年的总天数
2. 第year年[1, month-1]月的总天数
3. 第month月day天
（3）再用总天数 % 5（三天打鱼两天晒网的周期），根据结果来判断是打鱼还是晒网
（4）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除
如果要考虑年月日的输入合法性校验，代码较复杂
 */
public class HomeWork51_6 {
    public static void main(String[] args) {
        //年月日合规性判断

        Scanner input = new Scanner(System.in);
        int year, month, day;
        //年份合规性判断
        while (true) {
            System.out.print("请输入年份:");
            year = input.nextInt();
            if (year < 1990) System.out.println("您输入的年份不正确");
            else break;
        }
        //月份合规性判断
        while (true) {
            System.out.print("请输入月份:");
            month = input.nextInt();
            if (month <= 0 || month > 12) System.out.println("您输入的月份不正确");
            else break;
        }
        //日期合规性判断
        boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        int month2 = (leap) ? 29 : 28;
        while (true) {
            System.out.print("请输入日期:");
            day = input.nextInt();
            int x = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) x = 30;
            else if (month == 2) x = month2;

            if (day <= 0 || day > x) System.out.println("您输入的日期不正确");
            else break;
        }

        //总天数的计算
        //创建数组,用来保存每个月的天数
        int[] leapDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 366};
        int[] unleapDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 365};
        //计算1990年至今的总天数
        int yearDays = 0;
        for (int i = 1990; i < year; i++) {
            if (i % 4 ==0 && i % 100 != 0 || i % 400 == 0) yearDays += leapDays[12];
            else yearDays += unleapDays[12];
        }

//        System.out.println("yearDays =" + yearDays);

        //计算输入日期的这一年的总天数
        int days = 0;
        for (int i = 1; i < month; i++) {
            if (month == 4 || month == 6 || month == 9 || month == 11) days += 30 ;
            else if (month == 2) days += month2;
            else days += 31;
        }
        days += day;

//        System.out.println("days =" + days);


        //总天数
        int totalDays = yearDays + days;

//        System.out.println("totalDays =" + totalDays);

        //打渔还是晒网的判断
        if((totalDays % 5 >= 1) && (totalDays <= 3)) System.out.println("今天应该打渔");
        else System.out.println("今天应该晒网");
    }
}
