package com.atguigu.generic;


/*
自定义泛型的使用:
1. 泛型可以定义在类，接口上
2. 泛型可以定义在方法上,一般不会单独出现，通常会配合 extends/super 关键字设定泛型的上下限
*/
public class GenericDemo2 {
    public static void main(String[] args) {
        Demo<String> d1 = new Demo<>();
        d1.test1("hello");
        d1.test3(4);
        d1.test3(true);

        Demo<Integer> d2 = new Demo<>();
        d2.test1(4);
    }
}

class Demo<T> {
    public void test1(T t) {

    }

    public T test2() {
        // T t = new T();
        return null;
    }

    public <G> void test3(G g) {
        System.out.println(g.getClass());
    }

    public <E> E test4() {
        return null;
    }
}
