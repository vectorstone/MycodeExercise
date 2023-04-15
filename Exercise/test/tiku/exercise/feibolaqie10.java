package tiku.exercise;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:46 PM
 * 斐波拉且数列, f(n) = f(n-1)+f(n-2)
 */
public class feibolaqie10 {

    public int get(int n ){
        if(n == 1) return 1;
        if(n == 2) return 1;

        return get(n - 1) + get(n - 2);
    }
    @Test
    public void test(){
        System.out.println(get(7));
    }
}
