package tiku.exercise.bounceball5;

import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 4:25 PM
 * 第10次落地时,共经过多少米,第10次反弹多高
 */
public class BounceBallDistance {
    @Test
    public void bdistance(){
        int height = 100;
        int distance = 0;
        int count = 10;
        for (int i = 1; i <= count; i++) {
            //落下的高度
            distance += height;
            //反弹的高度
            height /= 2;
            //如果第10次,distance不加反弹高度,否则需要+反弹的高度
            if(i != count){
                distance += height;
            }
        }
        System.out.println("第"+count+"次落地时,共经过"+distance+"米");
        System.out.println("第"+count+"次反弹高度为"+height+"米");
    }
}
