import java.util.Scanner;

/*
1. 让用户输入一个数字，看它在数组里是否存在。如果存在打印下标，如果不存在，提示用户输入的数字不存在
2. 让数组翻转
3. 判断数组是否左右对称
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] nums = {8, 5, 2, 1, 5, 4, 1, 6, 5, 7, 3, 9};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int x = scanner.nextInt();
        scanner.close();

        // 找到x第一次出现的下标
        /*int index = -1;  // 假设x在数组里不存在
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) System.out.println("不存在");
        else System.out.println("下标是" + index);*/

        String indies = "";  // 使用一个字符串记录元素的下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                indies += i + " ";
            }
        }
        if (indies.equals("")) System.out.println("不存在");
        else System.out.println(x + "下标是" + indies);

        // 让数组翻转
        /*for (int i = 0; i < nums.length >> 1; i++) {
            int tmp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = tmp;
        }*/

        for (int left = 0, right = nums.length - 1; left < right/*left < nums.length >> 1*/; left++, right--) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "   ");
        }
        System.out.println();


        int[] arr = {1, 2, 3, 3, 2, 1};
        // 判断数组是否左右对称
        boolean symmetry = true; // 假设数组左右对称
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            if (arr[left] != arr[right]) {
                symmetry = false;
                break;
            }
        }
        if (symmetry) System.out.println("数组对称");
        else System.out.println("数组不对称");
    }
}
