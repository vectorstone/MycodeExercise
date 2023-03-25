/*
案例需求：判断某个数组是否属于对称数组，即数组正序遍历和倒序遍历的结果是一样的。例如：
开发提示：循环比较数组首尾对称位置元素是否相同，如果有不同，就不是对称数组，所有对称位置都相等才是对称数组。
 */
public class HomeWork51_5_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,3,1};
        boolean symmetry = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                symmetry = false;
                break;
            }
        }
        System.out.println("数组" + ((symmetry) ? "对称" : "不对称"));
    }
}
