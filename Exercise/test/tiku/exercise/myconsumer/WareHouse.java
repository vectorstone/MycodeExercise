package tiku.exercise.myconsumer;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:25 PM
 */
public class WareHouse{
    //创建数组,以及元素个数
    private Object[] buffer = new Object[10];
    private int total;
    //不需要空参构造方法,系统默认会提供一个

    //put方法,需要加锁,避免出现线程不安全的现象
    synchronized public void put(Object data){
        if(total >= buffer.length){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        buffer[total] = data;
        total++;
        System.out.println(data+"被存入,现有"+total+"个产品");
        this.notify();
    }

    //take方法,需要加锁,避免出现线程不安全的现象
    synchronized public Object take(){
        if(total <= 0){
            try{
                this.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        Object data = buffer[0];//把第一个产品返回
        System.arraycopy(buffer,1,buffer,0,total-1);
        total--;
        this.notify();
        System.out.println(data+"被取出,现有"+total+"个产品");
        return data;
    }
}
