package tiku.exercise.runnablethread18;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 10:15 PM
 */
public class runnable18 {
    @Test
    public void test(){
        new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
