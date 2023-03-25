import java.util.Arrays;

/**
 * @Description: 方法的重载
 * @Author: Gavin
 * @Date: 3/17/2023 9:02 PM
 */
/*
知识点：方法的重载
案例：
声明一个数组工具类MyArrays，包含如下方法，，并在main方法里调用：

 */
public class MethodHomeWork3 {
    public static void main(String[] args) {
    //1,2,3验证
        int[] arr = {1,2,3,4,5,6,7,8};
        //查找3
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch(arr,0));
        char [] arr1 = {'a','b','c','d','e','f','g'};
        double[] arr2 = {1.0,2.0,3.0,4.0,5.0,6.0};
        System.out.println("------------------------------------");
        System.out.println(binarySearch(arr1,'b'));
        System.out.println(binarySearch(arr1,'A'));
        System.out.println("------------------------------------");
        System.out.println(binarySearch(arr2,1.0));
        System.out.println(binarySearch(arr2,0));
        System.out.println("------------------------------------");

        System.out.println(Arrays.toString(copy(arr,10)));
        System.out.println(Arrays.toString(copy(arr1,10)));
        System.out.println(Arrays.toString(copy(arr2,10)));
        System.out.println("------------------------------------");
        int[] arr3 = {23,54,3,223,56,778,32,111,4};
        System.out.println(Arrays.toString(arr3));
        sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    //使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
    static int  binarySearch(int[]  arr,  int  value){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
           int middle = (start + end) >> 1;
            if (value < arr[middle]){
                end = middle - 1;
            }else if(value > arr[middle]){
                start = middle + 1;
            }else {
                for (int i = 0; i < arr.length; i++) {
                    if (value == arr[i]) return i;
                }
            }

        }
        return -1;
    }
    //使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
    static int  binarySearch(char[]  arr,  char  value){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = (start + end) >> 1;
            if (value < arr[middle]){
                end = middle - 1;
            }else if(value > arr[middle]){
                start = middle + 1;
            }else {
                for (int i = 0; i < arr.length; i++) {
                    if (value == arr[i]) return i;
                }
            }

        }
        return -1;
    }
    //使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
    static int  binarySearch(double[]  arr,  double  value){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = (start + end) >> 1;
            if (value < arr[middle]){
                end = middle - 1;
            }else if(value > arr[middle]){
                start = middle + 1;
            }else {
                for (int i = 0; i < arr.length; i++) {
                    if (value == arr[i]) return i;
                }
            }

        }
        return -1;
    }

    //从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length
    static int[]  copy(int[] arr , int length){
        int[] arr2 = new int[length];
        for (int i = 0; i < arr.length && i < length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    //从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length
    static double[]  copy(double[] arr , int length){
        double [] arr2 = new double[length];
        for (int i = 0; i < arr.length && i < length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    //从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length
    static char[]  copy(char[] arr , int length){
        char[] arr2 = new char[length];
        for (int i = 0; i < arr.length && i < length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;

    }

    //可以给arr数组从小到大排序，用冒泡排序实现
    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean status = true;
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    status = false;
                }
            }
            if (status) return;
        }

    }
    //可以给arr数组从小到大排序，用冒泡排序实现
    static void sort(char[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean status = true;
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    status = false;
                }
            }
            if (status) return;
        }
    }
    //可以给arr数组从小到大排序，用冒泡排序实现
    static void sort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean status = true;
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    status = false;
                }
            }
            if (status) return;
        }
    }
}
