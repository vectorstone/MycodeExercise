import java.util.Scanner;

/*
判断用户输入的字符是否是数字和字母
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一段内容:");
        char c = scanner.next().charAt(0);
        scanner.close();

        if (c >= '0' && c <= '9') {
            System.out.println("数字");
        } else if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println("字母");
        }else {
            System.out.println("非数字和字母");
        }
    }
}
