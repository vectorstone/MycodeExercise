package tiku.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:55 PM
 */
public class HeightTest {
    public static void main(String[] args){
        int height = 100;
        int distance = 0;
        int count = 10;
        for(int i = 1;i <= count;i++){
            distance += height;
            height /= 2;
            if(i != 10){
                distance += height;
            }
        }
        System.out.println("第"+count+"次落地时,共经过"+distance+"米");
        System.out.println("第"+count+"次反弹的高度为:"+height);
    }
}
