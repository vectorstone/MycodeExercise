import java.util.Arrays;

/*
冒泡排序: 让第i个和第i+1个比较，如果第i个大于第i+1个，交换两个数据的位置
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int count = 0;
        /*for (int j = 0; j < arr.length - 1; j++) {
            int reverseCount = 0;  // 统计每一趟交换的次数
            for (int i = 0; i < arr.length - 1 - j; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    reverseCount++;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            if (reverseCount == 0) break;
        }*/
        for (int j = 0; j < arr.length - 1; j++) {
            // boolean isReverse = false;  // 假设每一趟都没有交换
            boolean sorted = true; // 每一趟都假设这一趟已经有序了
            for (int i = 0; i < arr.length - 1 - j; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    // isReverse = true;
                    sorted = false;
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
            // if (!isReverse) break;
            if (sorted) break;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
