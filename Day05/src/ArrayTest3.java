import java.util.Arrays;

/*
1. 判断两个数组里的内容是否相同
2. 将数组转换成为 [e1,e2,...en]的形式字符串

Arrays.toString(数组) 可以将数组转换成为字符串
*/
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5};
        int[] arr2 = {3, 4, 5};

        System.out.println(arr1 == arr2);  // false

        boolean same = true;  // 假设两个数组一样
        if (arr1.length != arr2.length) same = false;
        else if (arr1 != arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println(same);


        int[] arr = {5, 9, 2, 3, 1, 5, 8};
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (i != arr.length - 1) s += ", ";
        }
        s += "]";
        System.out.println(s);

        String x = Arrays.toString(arr);
        System.out.println(x);
    }
}
