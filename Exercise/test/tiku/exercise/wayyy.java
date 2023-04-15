package tiku.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:58 PM
 */
public class wayyy {
    public static void main(String[] args){
        int ways = ways(3);
        System.out.println(ways);
    }
    public static int ways(int n){
        if(n <= 2) return n;
        return ways(n-1) + ways(n - 2);
    }
}
