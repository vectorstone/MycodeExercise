/*
数组在内存里的存储: 数组是引用数据类型，在栈区只有引用，真正的数据存储在堆区

java里的数据分为两大类型: 基本数据类型 和 引用数据类型
基本数据类型 = 是直接将值传递给变量; 引用数据类型 = 是将堆区里的地址传给变量
基本数据类型 == 比较的是值;  引用数据类型  == 比较的是内存地址
*/
public class ArrayDemo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b++;
        System.out.println("a = " + a + ",b = " + b);  // a=10,b=11

        int[] nums1 = {1, 2, 3};
        int[] nums2 = nums1;
        nums2[0]++;
        System.out.println(nums1[0]);  // 2


        int x = 5;
        int y = 5;
        System.out.println(x == y);  // true

        int[] arr1 = {4, 5, 6};
        int[] arr2 = {4, 5, 6};
        System.out.println(arr1 == arr2); // false
    }
}
