package tiku.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:12 PM
 */
public class binarySearch{
    public static void main(String[] args){
        char[] arr = {'a','b','c','d','e','f','g','h'};
        int start = 0;
        int end = arr.length;
        boolean flag = true;
        int medium = 0;
        while(start < end){
            medium = (start + end) / 2;
            if(arr[medium] < 'i'){
                start = medium + 1;
            }else if(arr[medium] > 'i'){
                end = medium - 1;
            }else if(arr[medium] == 'i'){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("没找到");
        }else{
            System.out.println('i'+"的位置是数组中的第"+(medium+1)+"号");
        }
    }
}