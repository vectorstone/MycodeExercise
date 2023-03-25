package com.atguigu.question13;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/24/2023 9:29 PM
 */
public class Programmer extends Employee {
    private String language;

    public Programmer() {
    }

    public Programmer(String language) {
        this.language = language;
    }

    public Programmer(int num, String name, int age, double salary, String language) {
        super(num, name, age, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getInfo() {
       return super.getInfo() + ",语言: "+language;
    }
}
