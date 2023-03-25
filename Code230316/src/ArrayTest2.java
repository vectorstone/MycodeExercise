import java.util.Scanner;

/*
1. 让用户输入一个数字，看它在数组里是否存在。如果存在打印下标，如果不存在，提示用户输入的数字不存在
2. 让数组翻转
3. 判断数组是否左右对称

长度12
i           后面
0            11
1            10
2             9
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] nums = {8, 5, 2, 1, 5, 4, 1, 6, 5, 7, 3, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int x = scanner.nextInt();
        scanner.close();

        // 找到x第一次出现的下标
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (x == nums[i]) {
                index = i;
                break;
            }
        }
        if( index != 0) System.out.println("找到了,数字的下标为: " + index);
        else System.out.println("您输入的数字不存在这个数组中");

        System.out.println("------------------------------");

        // 让数组翻转
        int temp = 0;
        for (int i = 0; i < nums.length - 1 - i; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        //遍历查看结果是否OK,如果最后一个元素,那么只打印数字,不加都好和空格
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if(i == nums.length-1) System.out.print(nums[i]);
            else System.out.print(nums[i] + ", ");
        }
        System.out.println("]");

        System.out.println("------------------------------");


        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        // 判断数组是否左右对称
        boolean symmetry = true;
        for (int i = 0; i < arr.length - 1 - i; i++) {
            if( arr[i] != arr[arr.length - 1 - i]) {
                symmetry = false;
                break;
            }
        }
        System.out.println("数组" + ((symmetry) ? "对称" : "不对称"));

    }
}
