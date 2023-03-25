import java.util.Scanner;
/*
从键盘输入一个字符,判断它是字母(a-z或A-Z),数字(0-9),还是其他字符
65-90对应A-Z
97-122对应a-z
48-57对应数字(0-9)
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个字符:");
        //使用next().charAt(0)来接受char类型的字符
       char x = scan.next().charAt(0);
       if(x >= 'A' && x <= 'Z') System.out.println(x + "属于A-Z");
        else if(x >= 'a' && x <= 'z') System.out.println(x + "属于a-z");
        else if(x >= '0' && x <= '9') System.out.println(x + "属于0-9");
        else System.out.println(x + "属于其他字符");

        scan.close();
    }
}
