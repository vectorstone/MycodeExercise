package tiku.exercise.customerandproduct;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:47 PM
 */
public class Test {
    public static void main(String[] args){
        HouseWare h = new HouseWare();

        Worker w = new Worker(h);
        Saler s = new Saler(h);

        w.start();
        s.start();
    }
}
