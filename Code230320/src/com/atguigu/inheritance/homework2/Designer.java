package com.atguigu.inheritance.homework2;

/**
 * @Description: 设计师
 * @Author: Gavin
 * @Date: 3/20/2023 6:51 PM
 */
public class Designer extends Programmer{
    private double bonus ;

    public Designer(){
        super();

    }
    public Designer(int number,String name,int age,double salary,String language,double bonus){
        super(number,name,age,salary,language);
        this.bonus = bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"奖金: " + bonus;
    }
}
