package tiku.exercise.customerandproduct;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:45 PM
 */
public class Saler extends Thread{
    private HouseWare h;

    public Saler(HouseWare h){
        super();
        this.h = h;
    }
    public void run(){
        while(true){
            Object take = h.take();
        }
    }
}
