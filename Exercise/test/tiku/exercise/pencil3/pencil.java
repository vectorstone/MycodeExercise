package tiku.exercise.pencil3;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 5:44 PM
 */
public class pencil {
    @Test
    public void testPencil(){
        //钢笔 x < 33
        //圆珠笔笔 y < 50
        //铅笔 100 - x - y
        //100块钱  3 * x + 2 * y + (100 - x - y) * 0.5 = 100;

        //循环遍历
        for (int x = 0; x < 33; x++) {
            for (int y = 0; y < 50; y++) {
                if((3 * x + 2 * y + (100 - x - y) * 0.5) == 100){
                    System.out.println("钢笔:"+x+"支");
                    System.out.println("圆珠笔:"+y+"支");
                    System.out.println("铅笔:"+(100 - x - y)+"支");
                    System.out.println("-----------------");
                    break;
                }
            }
        }
    }
}
