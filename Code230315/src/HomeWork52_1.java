import java.util.Arrays;

/*
1、随机产生偶数并排序
案例需求：随机产生10个[1,100]之间的偶数存储到数组中，并按照从小到大排序输出。
开发提示：
- 随机产生[1,50]范围内的整数 * 2 就能得到[1,100]之间的偶数
 */
public class HomeWork52_1 {
    public static void main(String[] args) {
        //创建数组,长度为10
        int[] arr = new int[10];
        //随机产生[1,50]范围内的整数
        //获取随机数公式获取一个[a,b]范围的随机整数?随机数公式
        //	(int)(Math.random() * (b - a + 1)) + a
        for (int i = 0; i < 10; i++) {
            arr[i] = ((int)(Math.random() * 50) + 1) * 2;
        }
        System.out.println(Arrays.toString(arr));
        //排序并输出,使用冒泡排序法
        //外循环控制总共排序的次数,内循环控制每一轮最小数的寻找
        //手撸选择排序法
        for (int i = 0; i < arr.length - 1; i++) {
            //接下来是内循环
            int min = i;
            for (int j = i + 1; j < arr.length/*总感觉这个地方不需要循环这么多次*/; j++) {
                if (arr[min] > arr[j] ){
                    min = j;
                }
//                System.out.println("i = " + i + ",j =" + j);
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
