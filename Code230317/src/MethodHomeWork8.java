/**
 * @Description: 方法的递归调用:通项公式
 * @Author: Gavin
 * @Date: 3/18/2023 8:23 AM
 */
/*
通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，
例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
请用递归的方式完成方法long f( int n)的方法体。
 */
public class MethodHomeWork8 {
    public static void main(String[] args) {
        System.out.println(getNumber(5));
    }
    public static int getNumber(int n) {
        if (n == 1) return 1;
        if (n == 2) return 3;
        return getNumber(n - 1) + n;
    }
}
