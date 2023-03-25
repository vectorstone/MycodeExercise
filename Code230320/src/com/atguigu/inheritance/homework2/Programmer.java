package com.atguigu.inheritance.homework2;

/**
 * @Description: 工程师类
 * @Author: Gavin
 * @Date: 3/20/2023 6:46 PM
 */
public class Programmer extends Employee{
    private String language = "java";

    /*public Programmer(){

    }*/
    public Programmer(int munber,String name,int age,double salary,String language){
        super(munber,name,age,salary);
        this.language = language;
    }

    public Programmer() {

    }

    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }
    @Override
    public String getInfo() {
        return super.getInfo()+"编程语言: " + language;
    }
}
