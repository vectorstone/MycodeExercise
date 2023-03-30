package com.atguigu.test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/30/2023 11:20 AM
 */
class Db{

    String str;
    Db(){//第4行

        str = "example";

    }

    Db(String s){//第8行

        str = "s";

    }

}

class DbTest1 extends Db{ }

public class DbTest2{
    public static void main(String[] args){
        Db d= new Db("Java");//第19行

        // DbTest1 d1 = new DbTest1("guigu");//第20行

    }

}
