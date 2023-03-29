/*
在同一个类(或者继承)里，允许出现多个同名但是参数不同的方法，这种现象称为方法的重载
重载只和 方法名以及参数有关，和返回值类型以及修饰符(public static)没有关系!!!

只要满足以下任一条件都可以视为参数不同:
    1. 参数的个数不同
    2. 参数的类型不同
    3. 参数的位置不同
如果只是形参名不同，把这多个方法视为一个方法
*/
public class MethodDemo3 {
    public static void main(String[] args) {
        test(5);
        test(4, 6);
        test(3, (byte) 5);
        test((byte) 3, 5);

        System.out.println(4);
        System.out.println("hello");
        System.out.println(new char[]{'a','b','c'});
        System.out.println(new int[]{1, 2, 3});
    }

    public static void test() {

    }

    public static void test(int a) {

    }
    // public static void test(int b){}

    public static void test(byte a) {

    }

    public static void test(String s) {

    }

    public static void test(int a, int b) {

    }

    public static void test(int a, byte b) {

    }

    public static void test(byte a, int b) {

    }

    /*public static int test(){
        return 2;
    }*/
}
