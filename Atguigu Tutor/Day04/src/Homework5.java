import java.util.Scanner;

/*
从2000年1月1日开始，三天打鱼两天晒网，从不间断。输入某一天，判断这一天是打鱼还是晒网
要求:输入的年月日必须要合法
 */
public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year, month, day;
        while (true) {
            System.out.print("请输入年份:");
            year = scanner.nextInt();
            if (year >= 2000) break;
            else System.out.println("输入的年份必须要大于等于2000");
        }
        while (true) {
            System.out.print("请输入月份:");
            month = scanner.nextInt();
            if (month > 0 && month <= 12) break;
            else System.out.println("输入的月份不合法");
        }
        int daysOfFeb = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
        while (true) {
            System.out.print("请输入日期:");
            day = scanner.nextInt();
            int x = 31;
            if (month == 2) {
                x = daysOfFeb;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                x = 30;
            }
            if (day > x || day < 1) {
                System.out.println("日期输入不合法");
            } else break;
        }
        scanner.close();
        // 输入的这一天和2000年1月1日相距多少天   days
        int days = day;

        // 满年的日期加上
        for (int i = 2000; i < year; i++) {  // 2000 ~ 2012
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) days += 366;
            else days += 365;
        }

        // 把剩下的满月也加上  2013年3月14日
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) days += 31;
            else if (i == 2) days += daysOfFeb;
            else days += 30;
        }

        // 获取到相距的天数以后，模与5 如果是012表示打渔，34表示晒网
        if ((days - 1) % 5 > 2) {
            System.out.println("晒网");
        } else {
            System.out.println("打渔");
        }
    }
}
