import java.util.Arrays;

/**
 * @Description: 猴子吃桃问题(方法的递归调用)
 * @Author: Gavin
 * @Date: 3/17/2023 10:53 PM
 */
/*
描述：猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，
又多吃了一个。第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。
以后每天都吃了前一天剩下的一半多一个。到第十天，只剩下一个桃子。
试求第一天共摘了多少桃子？
 */
public class MethodHomeWork7 {
    public static void main(String[] args) {

        //尝试用数组的方法来计算下
        int[] arr = new int[10];
        arr[9] = 1;
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0  ; i--) {
            arr[i - 1] = (arr[i] + 1) * 2;
        }
        System.out.println(Arrays.toString(arr));
        //这个地方要传的n是第几天的意思
        System.out.println(calculator(1));
    }
    public static int calculator (int n){
        if (n == 10) return 1;

        return (calculator(n + 1) + 1) * 2 ;
    }
}
