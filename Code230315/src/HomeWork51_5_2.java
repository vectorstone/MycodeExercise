/*
案例需求：判断某个数组是否属于对称数组，即数组正序遍历和倒序遍历的结果是一样的。例如：
开发提示：循环比较数组首尾对称位置元素是否相同，如果有不同，就不是对称数组，所有对称位置都相等才是对称数组。
 */
public class HomeWork51_5_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};

        //正序拼接
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            s1 += arr[i];
        }
        //逆序拼接
        String s2 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            s2 += arr[i];
        }

        System.out.println("数组" + ((s1.equals(s2)) ? "对称" : "不对称"));
    }
}
