package com.atguigu.question13;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:30 PM
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public Designer(String language, double bonus) {
        super(language);
        this.bonus = bonus;
    }

    public Designer(int num, String name, int age, double salary, String language, double bonus) {
        super(num, name, age, salary, language);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ",奖金: " + bonus;
    }
}
