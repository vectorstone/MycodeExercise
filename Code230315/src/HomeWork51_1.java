import java.util.Scanner;

/*
用一个数组,保存12个月的英语单词
 */
public class HomeWork51_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入对应月份的数字:");
        int month = input.nextInt();
        //判断月份是否输入正确
        while(true){
            if (month < 1 || month >12) {
                System.out.print("输入的月份不正确,请重新输入:");
                month = input.nextInt();
            }else break;//月份正确的时候结束循环
        }

        String[] arr = {"january", "february", "march", "April", "may", "June", "July", "August", "September", "October", "November", "December"};
//         System.out.println(Arrays.toString(arr));

        System.out.println("您输入的" + month + "对应的月份是:" + arr[month - 1]);


         input.close();
    }
}
