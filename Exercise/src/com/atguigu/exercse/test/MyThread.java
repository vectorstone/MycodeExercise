package com.atguigu.exercse.test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 10:34 PM
 */
public class MyThread implements Runnable {
    int i;
    @Override
    public void run(){
        /*try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }*/
        i = 100;
    }
}
