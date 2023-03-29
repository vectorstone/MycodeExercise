package Day2.Day2;

/*
 (1)先声明两个byte类型的变量b1,b2,并分别赋值为10和20，求b1和b2变量的和，
并将结果保存在byte类型的变量b3中，最后输出b3变量的值

（2）先声明两个short类型的变量s1,s2,并分别赋值为1000和2000，
求s1和s2变量的和，并将结果保存在short类型的变量s3中，最后输出s3变量的值

（3）先声明1个char类型的变量c1赋值为'a'，再声明一个int类型的变量num赋值为5，
求c1和num变量的和，并将结果将结果保存在char类型的变量letter中，最后输出letter变量的值。

（4）先声明两个int类型的变量i1,i2，并分别赋值5和2，求i1和i2的商，
并将结果保存在double类型的变量result中，最后输出result变量的值。如何得到结果2.5呢？
*/
public class Homework3 {
    public static void main(String[] args){

        //需求1:
        byte b1 = 10;
        byte b2 = 20;
        byte b3 =(byte)(b1 + b2);

        System.out.println("byte类型的b1和b2的和为:" + b3);

        //需求2:
        short s1 = 1000;
        short s2 = 2000;
        short s3 = (short)(s1 + s2);
        System.out.println("short类型的s1和s2的和为:" + s3);

        //需求3:
        char c1 = 'a';
        int num = 5;
        char letter = (char)(c1 + num);
        System.out.println("char类型的c1和int类型的num的和为:" + letter);

        //需求4:
        int i1 = 5;
        int i2 = 2;
        double result = (double)(i1 / i2);
        System.out.println("double类型的result的值是:" + result);

        //需求5: 想办法得到int i1 = 5;int i2 = 2;的商为2.5
        double i3 = i1;
        double i4 = i2;
        double result1 = i3 / i4;
        System.out.println("double类型的result1的值是:" + result1);



    }
}