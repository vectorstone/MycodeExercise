/*
6.找数组平衡数
案例需求：判断数组中是否存在一个值，其左侧的值累加加和等于其右侧的值累加和，如果存在，找出这个值，
如果不存在就显示不存在。
例如：[1,2,5,3,2,4,2]，结果为：平衡数是3，因为3左边的1,2,5累加和是8，3右边的2,4,2累加和也是8。
[9, 6, 8, 8, 7, 6, 9, 5, 2, 5]，结果是平衡数不存在。
 */
public class HomeWork52_6 {
    public static void main(String[] args) {
        //循环嵌套,外循环控制假设的那个数,内循环否则计算左右两侧的数值
        int[] arr= {9, 6, 8, 8, 7, 6, 9, 5, 2, 5};
        boolean exist = false;
        for (int i = 1; i < arr.length - 1; i++) {
            //计算i前面的所有数之和
            int sum1 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            //计算i后面的所有数之和
            int sum2 = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2){
                System.out.println("该数组平衡数是:" + i);
                exist = true;
            }
        }
        if (!exist) System.out.println("该数组不存在这样的数");
    }
}
