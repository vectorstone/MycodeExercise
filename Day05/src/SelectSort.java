import java.util.Arrays;

/*
选择排序:
*/
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};

        /*int minIndex = 0;  // 假设下标为0的元素是最小值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != 0) {
            int tmp = arr[minIndex];
            arr[minIndex] = arr[0];
            arr[0] = tmp;
        }

        minIndex = 1;  // 假设下标为1的元素是最小值
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != 1) {
            int tmp = arr[minIndex];
            arr[minIndex] = arr[1];
            arr[1] = tmp;
        }

        minIndex = 2;  // 假设下标为2的元素是最小值
        for (int i = 3; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != 2) {
            int tmp = arr[minIndex];
            arr[minIndex] = arr[2];
            arr[2] = tmp;
        }

        minIndex = 3;  // 假设下标为3的元素是最小值
        for (int i = 4; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        if (minIndex != 3) {
            int tmp = arr[minIndex];
            arr[minIndex] = arr[3];
            arr[3] = tmp;
        }*/

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
