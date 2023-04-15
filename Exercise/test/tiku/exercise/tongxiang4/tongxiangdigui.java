package tiku.exercise.tongxiang4;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:00 PM
 * 通项递归
 */
public class tongxiangdigui {
    public int digui(int x){
        if(x == 1) return 1;
        return x + digui(x - 1);
    }
    @Test
    public void testdigui(){
        System.out.println(digui(4));
    }
}
