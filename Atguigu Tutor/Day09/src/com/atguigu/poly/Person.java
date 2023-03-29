package com.atguigu.poly;

public class Person {
    private String name;
    private PoliceDog pd;

    private SearchDog sd;

    private DrugDog dd;

    public Person(String name, PoliceDog pd) {
        this.name = name;
        this.pd = pd;
    }

    public Person(String name, SearchDog sd) {
        this.name = name;
        this.sd = sd;
    }

    public Person(String name, DrugDog dd) {
        this.name = name;
        this.dd = dd;
    }

    public void workWithPD() {
        this.pd.attackEnemy();
    }

    public void workWithSD() {
        this.sd.searchLife();
    }

    public void workWithDD() {
        this.dd.searchDrug();
    }
}
