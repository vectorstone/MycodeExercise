package com.atguigu.exercise.test03;


public class Test03 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
        s.setInfo("尚硅谷");
        System.out.println(f.getInfo());
        System.out.println(s.getInfo());
    }
}
class Father{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son extends Father{

}
