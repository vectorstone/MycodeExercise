package tiku.exercise.customerandproduct;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:37 PM
 * 仓库
 */
public class HouseWare {
    private Object[] buffer = new Object[10];
    private int total;

    synchronized public void put(Object data){
        if(total >= buffer.length){
            try{
                this.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        buffer[total] = data;
        total++;
        System.out.println(data+"被存入,现在数量是:"+total);
        this.notify();
    }
    synchronized public Object take(){
        if(total <= 0){
            try{
                this.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        Object data = buffer[0];
        System.arraycopy(buffer,1,buffer,0,total - 1);
        total--;
        this.notify();
        System.out.println(data+"被去除,现在数量是:"+total);
        return data;
    }
}
