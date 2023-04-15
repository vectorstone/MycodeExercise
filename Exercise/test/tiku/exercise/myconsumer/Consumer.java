package tiku.exercise.myconsumer;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:25 PM
 */
public class Consumer extends Thread{
    private WareHouse h;
    public Consumer(WareHouse h){
        super();
        this.h = h;
    }
    public void run(){
        while(true){
            Object data = h.take();
        }
    }
}
