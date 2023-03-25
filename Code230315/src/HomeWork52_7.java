import java.util.Arrays;

/*
左奇右偶
案例需求：现有一个长度为10的整数数组{26,67,49,38,52,66,7,71,56,87}。
现在需要对元素重新排列，使得所有的奇数保存到数组左边，所有的偶数保存到数组右边。
效果如图所示：
开发提示：左边的偶数与右边的奇数换位置

- 定义两个变量left和right，从左边开始查找偶数的位置，找到后用left记录，
从右边开始找奇数的位置，找到后用right记录，如果left<right，那么就交换，
然后在上一次的基础上继续查找，直到left与right擦肩。
 */
public class HomeWork52_7 {
    public static void main(String[] args) {
        int[] arr = {26,67,49,38,52,66,7,71,56,87};
        int left = 0;
        int right = 10;
        //找奇数的循环
        while(true){
            boolean rightResult = false;
            boolean leftResult = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    left = i;
                    leftResult = true;
                    break;
                }
            }
            //找偶数的循环
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] % 2 != 0) {
                    right = i;
                    rightResult = true;
                    break;
                }
            }
            if (left < right){
                if (leftResult && rightResult){
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }else break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
