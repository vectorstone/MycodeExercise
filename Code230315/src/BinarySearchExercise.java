import java.util.Scanner;

/*
二分法查找某个元素的代码实现
 */
public class BinarySearchExercise {
    public static void main(String[] args) {
        int[] arr = {4, 33, 45, 45, 99, 112, 123, 333, 625};
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查找的数字:");
        int x = input.nextInt();


        int start = 0;
        int end = arr.length - 1;

        for(int i = 0;start <= end;i++){
            int middle = (start + end) / 2;
            if ( arr[middle] < x){
                start = middle + 1;
            }else if(arr[middle] > x){
                end = middle - 1;
            }else if(arr[middle] == x) {
                System.out.println("数组中有你查找的数字");
                break;
            }
        }

        if(start > end) System.out.println("数组中没有你查找的数字");

        input.close();
    }
}
