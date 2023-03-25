package com.atguigu.question13;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:30 PM
 */
public class Architect extends Designer {
    private int stock;

    public Architect(double bonus, int stock) {
        super(bonus);
        this.stock = stock;
    }

    public Architect(String language, double bonus, int stock) {
        super(language, bonus);
        this.stock = stock;
    }

    public Architect(int num, String name, int age, double salary, String language, double bonus, int stock) {
        super(num, name, age, salary, language, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ",股票: " + stock;
    }
}
