import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总金额:");
        double totalPrice = scanner.nextDouble();
        scanner.close();

        if (totalPrice > 0) {
            double discount = 1.0;  // 默认没有折扣
            if (totalPrice >= 500) {
                discount = 0.8;
            } else if (totalPrice >= 400) {
                discount = 0.85;
            } else if (totalPrice >= 300) {
                discount = 0.9;
            } else if (totalPrice >= 200) {
                discount = 0.95;
            }
            System.out.println("折扣:" + discount);
            System.out.println("总价格:" + totalPrice);
            System.out.println("折后价格:" + totalPrice * discount);
        } else {
            System.out.println("总金额错误");
        }
    }
}
