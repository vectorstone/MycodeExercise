import java.util.Scanner;

/*
2023年的1月1日星期日，让用户输入月份和日期，计算今天星期几
*/
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份:");
        int month = scanner.nextInt();  // 6
        System.out.print("请输入日期:");
        int day = scanner.nextInt();  // 17
        scanner.close();

        int x = 7;  // 1月1日星期日
        int days = day;  // days不再是固定的100天，而是要计算今天距离1月1日有多少天

        /*switch (month) {
            case 2:
                days += 31;
                break;
            case 3:
                days += 31 + 28;
                break;
            case 4:
                days += 31 + 28 + 31;
                break;
            case 5:
                days += 31 + 28 + 31 + 30;
                break;
            case 6:
                days += 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                days += 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                days += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
            default:
                System.out.println("输入有误");
                break;
        }*/

        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        // days表示的是这一天是这一年的第几天
        days--;  //  这一年和1月1日相距的天数
        int week = (days + x) % 7;
        System.out.println(week == 0 ? "日" : week);
    }
}
