package tiku.exercise.myconsumer;

import java.util.Random;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:25 PM
 */
public class Worker extends Thread{
    private WareHouse h;
    //带参构造方法
    public Worker(WareHouse h){
        super();
        this.h = h;
    }
    public void run(){
        Random r = new Random();
        while(true){
            h.put(r.nextInt());
        }
    }
}