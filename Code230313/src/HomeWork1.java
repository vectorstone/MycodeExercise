import java.util.Scanner;

/*
从键盘输入一个整数，判断它是否是5的倍数
 */
public class HomeWork1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个整数:");
        int x = scan.nextInt();

        System.out.println(x + ((x % 5 == 0 && x != 0) ? "是5的倍数" : "不是5的倍数"));

        scan.close();
    }
}
