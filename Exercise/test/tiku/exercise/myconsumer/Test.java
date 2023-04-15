package tiku.exercise.myconsumer;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:26 PM
 */
public class Test {
    public static void main(String[] args) {
        WareHouse h = new WareHouse();
        Worker w = new Worker(h);
        Consumer c = new Consumer(h);

        w.start();
        c.start();
    }
}
