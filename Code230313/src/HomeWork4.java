import java.util.Scanner;

/*
从键盘输入月份值(1-12),使出对应月份的英语单词,如果月份值超过1-12,提示输入错误!
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入对应月份的数字:");
        int month = input.nextInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
        input.close();
    }
}
