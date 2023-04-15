package tiku.exercise.jiesheng5;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:05 PM
 */
public class jiecheng {
    public int jiecheng2(int x){
        if(x == 1) return 1;
        return x * jiecheng2(x - 1);
    }

    public int sum(int x){
        if(x == 1) return 1;
        if(x == 2) return 3;
        return jiecheng2(x) + sum(x - 1);
    }
    @Test
    public void test(){
        System.out.println(sum(4));
    }
}
