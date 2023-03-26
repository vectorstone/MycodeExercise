package Exercise.test08;

public class Test08 {
    public static void main(String[] args) {
        //使用满参构造方法创建Person对象,生命值传入一个负数
        try{
            Person p = new Person("jerry",-1);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }


        try{
            //调用空参构造创建Person对象
            Person p1 = new Person();

            //调用setLifeValue(int lifevalue)方法,传入一个正数,运行程序
            p1.setLifeValue(22);

            //调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
            p1.setLifeValue(-6);
        }catch (NoLifeValueException e){
            e.printStackTrace();
        }


    }
}
