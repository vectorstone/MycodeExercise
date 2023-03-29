import java.util.Scanner;

/*
二分查找，也叫折半查找。折半查找可以提高查询的效率，要求查询的数据必须要排序!
*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 54, 60, 67, 75, 80, 82, 89, 94, 98, 100, 102, 114};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int x = scanner.nextInt();
        scanner.close();

        /*int start = 0, end = nums.length - 1, middle = (start + end) >> 1;
        int index = -1;
        while (true) {
            if (nums[middle] > x) {
                end = middle - 1;
                middle = (start + end) >> 1;
            } else if (nums[middle] < x) {
                start = middle + 1;
                middle = (start + end) >> 1;
            } else {
                index = middle;
                break;
            }
            if (end < start) break;
        }*/
        int start = 0, end = nums.length - 1, middle;
        int index = -1;
        while (start <= end) {
            middle = (start + end) >> 1;
            if (nums[middle] > x) {
                end = middle - 1;
            } else if (nums[middle] < x) {
                start = middle + 1;
            } else {
                index = middle;
                break;
            }
        }

        System.out.println(index);
    }
}
