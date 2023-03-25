/**
 * @Description: 不死神兔
 * @Author: Gavin
 * @Date: 3/17/2023 9:57 PM
 */
/*
用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
问：现有一对刚出生的兔子n个月以后会有多少对兔子?
 */
public class MethodHomeWork6 {
    public static void main(String[] args) {
        int count = getCount(12);
        System.out.println(count);
    }

    public static int getCount(int n) {
        if (n == 1 || n == 2) return 1;
        return getCount(n - 2) + getCount(n - 1);
    }

}
