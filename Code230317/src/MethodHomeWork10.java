/**
 * @Description: code analysis
 * @Author: Gavin
 * @Date: 3/18/2023 9:01 AM
 */
/*

 */
public class MethodHomeWork10 {
    public static void main(String[] args) {
        int i = 0;
        change(i);//调用后i = 2
        i = i++; //先赋值,再自增加  i等于0
        System.out.println("i = " + i);//3吧

        int[] nums = {1, 2, 3};
        change(nums);
        System.out.println(nums[0]);//10

    }

    public static void change(int i) {//这个地方的i是形参,和main方法中的i没有关系
        i++;
    }

    public static void change(int[] arr) {
        arr[0] = 10;
    }
}