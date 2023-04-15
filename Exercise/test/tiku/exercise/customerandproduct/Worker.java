package tiku.exercise.customerandproduct;

import java.util.Random;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:44 PM
 */
public class Worker extends Thread{
    private HouseWare h;
     public Worker(HouseWare h) {
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
