package tiku.exercise;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 10:50 PM
 */
public class bubbleSortt {
    @Test
    public void test(){
        int[] arr = {5,7,3,9,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
