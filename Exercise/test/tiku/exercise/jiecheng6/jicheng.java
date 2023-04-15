package tiku.exercise.jiecheng6;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:16 PM
 */
public class jicheng {
    public int digui(int x){
        if(x == 1) return 10;
        return digui(x -1) + 2;
    }
    @Test
    public void test(){
        System.out.println(digui(8));

    }
}
