/*
求int数组的和，平均值，大于平均值的元素个数
*/
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] nums = {18, 35, 36, 23, 19, 77};

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
        int average = sum / nums.length;
        System.out.println(average);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > average) count++;
        }
        System.out.println(count);
    }
}
