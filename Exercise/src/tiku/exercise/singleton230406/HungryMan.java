package tiku.exercise.singleton230406;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/6/2023 9:25 PM
 * 饿汉单例设计模式
 */
public class HungryMan {
    /*private static  HungryMan instance;

    //构造方法私有化,禁止外部创建实例对象
    private HungryMan(){}

    //提供get方法,供外部访问,由于外部不能创建对象,方法得是静态的,可以通过类名直接调用
    public static HungryMan getInstance(){
        if(instance == null){
            instance = new HungryMan();
        }
        return instance;
    }*/
    //还有一种写法
    public static final HungryMan instance = new HungryMan();

    private HungryMan(){}

    public static HungryMan getInstance(){
        return instance ;
    }
}
