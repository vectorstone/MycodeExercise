/**
 * @Description: 方法的基本使用: 1可变参数
 * @Author: Gavin
 * @Date: 3/17/2023 8:24 PM
 */
/*
知识点：可变参数
案例：
在Count类中，声明如下方法，并在main方法里调用：
1、public static long  sum(int...  nums)：求0~n个整数的累加和，如果没有传参，就返回0
2、public static int max(int a, int... others)：求1~n个整数中的最大值
3、public static String concat(String...  strings)：求0~n个字符串的拼接结果
4、public static boolean isEven(int... nums)：判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
 */
public class MethodHomeWork1 {
    public static void main(String[] args) {
        //求0~n个整数的累加和，如果没有传参，就返回0
        System.out.println("求0~n个整数的累加和，如果没有传参，就返回0");
        System.out.println("1,2,3,4,5,6,7的累加和: " + sum(1,2,3,4,5,6,7));
        System.out.println("-----------------------------------");
        //求1~n个整数中的最大值
        System.out.println("求1~n个整数中的最大值");
        System.out.println("1,2,3,4,5,6,7,0中的最大值为:" + max(1,2,3,4,5,6,7,0));
        System.out.println("-----------------------------------");
        //求0~n个字符串的拼接结果
        System.out.println("求0~n个字符串的拼接结果");
        System.out.println("今天,明天,后天,a,b的拼接结果是: " + concat("今天","明天","后天","a","b"));
        System.out.println("-----------------------------------");
        //判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
        System.out.println("判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false");
        System.out.println("2,4,6,8,10,12是否都是偶数:" + isEven(2,4,6,8,10,12));
        System.out.println("2,3,4,5,6,7,8是否都是偶数:" + isEven(2,3,4,5,6,7,8));
    }
    //求0~n个整数的累加和，如果没有传参，就返回0
    public static long  sum(int...  nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    //求1~n个整数中的最大值
    public static int max(int a, int... others){
        int max = 1;
        for (int i = 0; i < others.length; i++) {
            if (max < others[i]) max = others[i];
        }
        return max;

    }
    //求0~n个字符串的拼接结果
    public static String concat(String...  strings){
        String sentence = "";
        for (int i = 0; i < strings.length; i++) {
            sentence += strings[i];
        }
        return sentence;
    }
    //判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false
    public static boolean isEven(int... nums){
        boolean status = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) status = false;
        }
        return status;
    }
}
