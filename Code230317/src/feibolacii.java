/**
 * @Description: 斐波拉契
 * @Author: Gavin
 * @Date: 3/17/2023 4:52 PM
 */
/*

 */
public class feibolacii {
    public static void main(String[] args) {
        int n = 5;
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i <= n - 2; i++) {

            int x = num1;
            num1 = num2;
            num2 = num1 + num2;
        }
        System.out.println(num2);
    }
}
