import java.util.Arrays;
/*
需求9: 求数组中元素的最短距离
案例需求：随机产生10个[0,100）之间整数存储到数组中，找出数组中的两个元素x和y，使得(x - y)绝对值最小。
开发提示：
- 将数组进行排序
- 求相邻元素的差，差值最小值就是最短距离
 */
public class HomeWork52_9 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arr = new int[10];
        //将产生的随机数存储到数组中
        for (int i = 0; i < 10; i++) {
            //随机产生[0,99]之间的整数
            //获取随机数公式获取一个[a,b]范围的随机整数?随机数公式(int)(Math.random() * (b - a + 1)) + a
            int x = (int)(Math.random() * 100);
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
        //将数组排序,冒泡法
        for (int i = 0; i < arr.length; i++) {
            boolean change = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    change = false;
                }
            }
            if (change) break;
        }
        //冒泡排序结束,打印数组确认结果是否OK
        System.out.println(Arrays.toString(arr));
        //创建数组difference来保存之前数组相邻两元素之间的差值
        int[] difference = new int[9];
        for (int i = 0; i < arr.length - 1; i++) {
            difference[i] = arr[i + 1] - arr[i];
        }
        System.out.println(Arrays.toString(difference));
        //遍历保存差值的数组difference,求出最小值
        int min = 0;

        for (int i = 0; i < difference.length; i++) {
            if (difference[min] > difference[i]) {
                min = i;
            }
        }
        System.out.println("min = "+ min);
        //确认最小值在数组中的个数
        int count = 0;
        for (int i = 0; i < difference.length; i++) {
            if (difference[min] == difference[i]) count++;
        }
        System.out.println("count = "+ count);
        /*根据上一步遍历的结果(也就是最小值的个数),来动态初始化创建新的数组combination
        用来保存最小值的下标
         */
        int[] combination = new int[count];
        //循环遍历difference数组,将最小值的下标保存在新的数组combination中
            int index = 0;
            for (int i = 0; i < difference.length; i++) {
                if(difference[min] == difference[i]){
                    combination[index] = i;
                    index++;
                }
            }
        //循环遍历,输出所有符合要求的x-y的组合
        for (int i = 0; i < combination.length; i++) {
            System.out.println("x = " + arr[combination[i]] + ",y = " + arr[combination[i] + 1]);
        }
    }
}
