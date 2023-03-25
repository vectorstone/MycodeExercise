import java.util.Arrays;

/*
冒泡排序法的代码实现
 */
public class BubbleSortExercise {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {333, 4, 625, 112, 45, 123, 99, 45, 33};
        
        //冒泡法排序

        for (int j = 0; j < arr.length - 1; j++) {
            boolean change = false;
            //先写内循环
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    change = true;
                }
            }
            System.out.println(Arrays.toString(arr));

        }



    }
}
