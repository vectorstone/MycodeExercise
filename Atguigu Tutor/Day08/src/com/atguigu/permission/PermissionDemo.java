package com.atguigu.permission;

import com.atguigu.inheritance.Animal;

/*
权限修饰符，规定类、方法、属性能够被访问的范围:
    public > protected > 缺省 > private

                    public    protected   缺省(不写)    private
本类                 √          √           √           √
本包                 √          √           √           ×
子类(其他包的子类)     √          √           ×           ×
其他包的无关类         √          ×           ×           ×

public权限最大，哪儿都可以访问;  protected子类访问; 缺省是本包访问;  private只有本类可以访问
protected 子类访问: 在子类里直接访问，而不是创建子类对象以后，通过对象访问

可以用来修饰哪些内容:
public: 修饰  类、成员变量和方法
protected: 修饰 成员变量和方法
缺省:   修饰  类、成员变量、方法 和 局部变量
private: 修饰 成员变量和方法(内部类)

普通类只能使用  缺省或者 public;  属性和方法可以使用全部的权限修饰符; 局部变量只能使用缺省!
*/
public class PermissionDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.name);
        // System.out.println(a.age);

        Dog d = new Dog();
        System.out.println(d.name);
        // System.out.println(d.age);
    }
}
