/**
 * @Description: 方法的声明与调用, 方法的重载
 * @Author: Gavin
 * @Date: 3/17/2023 8:42 PM
 */
/*
知识点：方法的声明与调用、方法的重载
案例：
声明一个图形工具类GraphicTools，包含如下方法，并在main方法里调用：
1、public static void printRectangle()：该方法打印5行5列*矩形
2、public static void printRectangle(int line, int column, String sign)：
该方法打印line行colomn列由sign组成的矩形
3、public static double getTriangleArea(double base, double height)：
根据底边和底边对应的高求三角形面积
4、public static double getTriangleArea(double a, double b, double c)：
根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
 */
public class MethodHomeWork2 {
    public static void main(String[] args){
        printRectangle();
        System.out.println("-------------------------");
        printRectangle(3,5,"你好");
        System.out.println("-------------------------");
        System.out.println("底为"+ 3 + ",高为4的三角形的面积为:" + getTriangleArea(3,4));
        System.out.println("-------------------------");
        System.out.println("三条边:"+3+","+4+","+5+"组成的三角形的面积是:" + getTriangleArea(3,4,5));





    }
    //public static void printRectangle()：该方法打印5行5列*矩形
    public static void printRectangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*2、public static void printRectangle(int line, int column, String sign)：
    该方法打印line行colomn列由sign组成的矩形*/
    public static void printRectangle(int line, int column, String sign){
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign + " ");
            }
            System.out.println();
        }
    }

    //根据底边和底边对应的高求三角形面积
    public static double getTriangleArea(double base, double height){
        return  base * height / 2;
    }

    //根据三角形的三条边求三角形面积，如果a,b,c不能组成三角形，打印不能组成三角形，并返回0.0
    public static double getTriangleArea(double a, double b, double c){
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c ) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        System.out.println(a + "," + b + "," + c + "不能组成三角形");
        return 0.0;
    }


}
