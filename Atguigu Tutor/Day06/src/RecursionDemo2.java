/*
1. 递归求 1+2+3+...+n的和  1+2+3+4+5+6+7 -> 7+sum(6) -> 7+6+sum(5)
    sum(n) = n+sum(n-1)
2. 斐波那契数列  1,1,2,3,5,8,13,21,34,55,89,144
*/
public class RecursionDemo2 {
    public static void main(String[] args) {
        int x = sum(100);
        System.out.println(x);

        int y = fn(9);
        System.out.println(y);

        int z = fibonacci(8);
        System.out.println(z);
    }

    /*public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }*/
    public static int sum(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static int fn(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;
        return fn(n - 2) + fn(n - 1);
    }

    public static int fibonacci(int n) {
        int num1 = 1, num2 = 1;
        for (int i = 0; i < n - 1; i++) {
            int x = num1;
            num1 = num2;
            num2 = x + num2;
        }
        return num1;
    }
}
