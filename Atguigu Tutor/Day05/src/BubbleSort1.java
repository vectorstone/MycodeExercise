import java.util.Arrays;

/*
冒泡排序: 让第i个和第i+1个比较，如果第i个大于第i+1个，交换两个数据的位置
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        /*arr[0] arr[1]
        arr[1] arr[2]
        arr[2] arr[3]
        ... ... ...
        arr[n] arr[n+1]
        ... ... ...
        arr[length-2]  arr[length-1]
         */

        int count = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            /*
            当j=0, ?=arr.length - 1
            当j=1, ?=arr.length - 1 - 1
            当j=2, ?=arr.length - 1 - 2
            .....  ?=arr.length - 1 - j
             */
            for (int i = 0; i < arr.length - 1 - j; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
