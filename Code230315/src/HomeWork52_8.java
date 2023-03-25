import java.util.Arrays;

/*
需求:查找数组中个数过半的数字
案例需求：有一个长度为10的整型元素的数组arr，其中有一个元素出现次数超过n / 2，求这个元素。
int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
开发提示：
- 对数组进行排序
- 取占据数组中间位置的元素，如果某个数字出现的次数过半，那么给数组排序后，这个数字一定会占据数组中间的位置
- 统计占据数组中间位置的元素实际出现的次数，这样就不用统计每一个数字出现的次数了
 */
public class HomeWork52_8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        //手撸冒泡排序,对数组进行排序
        for (int j = 0; j < arr.length; j++) {
            //先来内循环
            boolean change = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    change = false;
                }
//                System.out.println("j = " + j +", i = " + i);

            }
//            System.out.println(j);
            if (change) break;
        }

        //求这个元素和这个元素实际出现的次数
        int x = arr[arr.length >> 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("数组中出现次数过半的元素是:" + x + ",这个元素在数组中出现的次数是:" + count);
    }
}
