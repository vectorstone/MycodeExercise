import java.util.Arrays;

/*
方法调用时传参注意事项:  基本数据类型是值的传递，引用数据类型是内存地址的传递
 */
public class ValueDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b++;
        System.out.println(b);  // 11
        System.out.println(a);  // 10

        int[] nums1 = {1, 2, 3};
        int[] nums2 = nums1;
        nums2[0]++;
        System.out.println(nums1[0]);  // 2


        int m = 5;
        test(m);
        System.out.println(m);  // 5

        int[] nums3 = {3, 4, 5};
        test(nums3);
        System.out.println(Arrays.toString(nums3));
    }

    public static void test(int x) {  // int x = 5;
        x++;
    }

    public static void test(int[] arr) {  // int[] arr = nums3;
        arr[0]++;
    }
}
