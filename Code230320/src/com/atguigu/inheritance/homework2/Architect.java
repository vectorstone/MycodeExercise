package com.atguigu.inheritance.homework2;

/**
 * @Description: 架构师
 * @Author: Gavin
 * @Date: 3/20/2023 6:52 PM
 */
public class Architect extends Designer{
    private int stock;

    public Architect(){

    }
    public Architect(int number,String name,int age,double salary,String language,double bonus,int stock){
        super(number,name,age,salary,language,bonus);
        this.stock = stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public int getStock(){
        return stock;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"持有股票数量: " + stock;
    }
}
