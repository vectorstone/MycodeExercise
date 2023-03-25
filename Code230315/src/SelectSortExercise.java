import java.util.Arrays;

/*
选择排序法的代码实现
length = 9
内循环次数
i     次数
0      8
1      7
 */
public class SelectSortExercise {
    public static void main(String[] args) {
        //定义一个乱序的数组
        int[] arr = {333, 4, 625, 112, 45, 123, 99, 45, 33};

        //拿第一个依次和后面的比,有比第一个小的,就记录下来,然后遍历结束后,位置

/*
    这个方法也可以,但是这不是选择排序法
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[i] > arr[j+1]){
                    int temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }*/
        //找到本次循环中最小的,记录下来,最后再交换位置
        for (int i = 0; i < arr.length-1/*这个地方到底要不要-1*/; i++) {
            //先定义一个变量来接受最小的那个下标
            int index = i;
            //内循环
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]){
                    index = j;//记录下来此时这个较小值的下标
                }
            }
                if (index != i){
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
        }


        System.out.println(Arrays.toString(arr));
    }
}
