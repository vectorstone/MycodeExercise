import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生的个数:");

        int count = scanner.nextInt();
        int[] scores = new int[count];  // 动态初始化，指定长度

        for (int i = 0; i < count; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
            int x = scanner.nextInt();
            scores[i] = x;
        }

        scanner.close();
    }
}
