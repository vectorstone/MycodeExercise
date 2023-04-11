package tiku.exercise.singleton10;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/6/2023 9:25 PM
 * 懒汉单例设计模式,存在线程安全问题,需要上锁
 */
public class LazyMan {
    private static LazyMan instance;

    private LazyMan(){}

    public static  LazyMan getInstance(){
        if(instance == null){
            synchronized (LazyMan.class){
                if(instance == null){
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }
}
