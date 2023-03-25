/*
求数组的极值(最大值、最小值)以及对应的下标
*/
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 8, 6, 9, 3, 2};

        int max = arr[0];  // 假设第0个是数组里的最大数
        int maxIndex = 0;  // 假设最大数字的下标是0
        // 让 max 和 arr里的每一个元素都进行比较
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // 如果发现了有一个数字比假设的最大数还要大
                max = arr[i];  // 假设的最大数修改为第i个数字
                maxIndex = i;  // 假设的最大数下标修改为i
            }
        }

        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("最大数是" + max + "，它的下标是" + maxIndex + "；最小数是" + min + "，它的下标是" + minIndex);
    }
}
