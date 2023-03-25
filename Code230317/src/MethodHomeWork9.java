/**
 * @Description: 有n步台阶, 一次只能上1步或2步, 共有多少种走法
 * @Author: Gavin
 * @Date: 3/18/2023 8:39 AM
 */
/*
有n步台阶，一次只能上1步或2步，共有多少种走法？
 */
public class MethodHomeWork9 {
    public static void main(String[] args) {
        System.out.println(workWay(4));
    }

    public static int workWay (int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        return workWay(n - 1) + workWay(n - 2);
    }
}
/*
台阶          走法
1             1
2             2
3             3
4             5
* */
