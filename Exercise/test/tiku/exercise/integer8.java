package tiku.exercise;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:26 PM
 */
public class integer8 {
    @Test
    public void test(){
        int num = 98765;
        String x = num + "";
        StringBuilder s = new StringBuilder(x);
        s.reverse();
        String s1 = s.toString();
        int i = Integer.parseInt(s1);
        System.out.println(i);
    }
}
