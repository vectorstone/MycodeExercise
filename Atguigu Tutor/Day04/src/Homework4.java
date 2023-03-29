import java.util.Scanner;

/*
判断输入的年月日是否合法
 */
public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年:");
        int year = scanner.nextInt();
        System.out.print("请输入月:");
        int month = scanner.nextInt();
        System.out.print("请输入日:");
        int day = scanner.nextInt();
        scanner.close();


        boolean valid = true;
        if (year > 0) {
            if (month <= 0 || month > 12) {
                System.out.println("月份不合法");
                valid = false;
            } else {
                int x = 31;  // 一个月默认是31天
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    x = 30;
                } else if (month == 2) {
                    boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                    x = leap ? 29 : 28;
                }
                if (day <= 0 || day > x) {
                    System.out.println("日期不合法");
                    valid = false;
                }
            }
        } else {
            System.out.println("年份不合法");
            valid = false;
        }
        if (valid) System.out.println(year + "年" + month + "月" + day + "日合法");
    }
}
