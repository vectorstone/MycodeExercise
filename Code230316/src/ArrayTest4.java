import java.util.Arrays;

/*
求数组的极值(最大值、最小值)以及对应的下标
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 8, 6, 9, 3, 2};
        int max = arr[0];//假设第0个是数组里面最大数
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
               maxIndex = i;
           }else{
               min = arr[i];
               minIndex = i;
           }

        }
        System.out.println("最大值是:" + max + ",最大值下标是:" + maxIndex);
        System.out.println("最小值是:" + min + ",最小值下标是:" + minIndex);

        System.out.println(Arrays.toString(arr));
    }
}
