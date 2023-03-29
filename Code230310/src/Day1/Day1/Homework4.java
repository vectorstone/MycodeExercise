package Day1.Day1;

/*
1. 定义类 Homework4
2. 定义 main方法
3. 使用final定义变量，用来表示圆周率并赋值为3.14
4. 再使用3个变量分别保存圆的半径，分别赋值为1.2、2.5、6
5. 使用计算表达式求它们的面积，并输出显示半径和面积值。
*/
public class Homework4 {
    public static void main(String[] args){
        //使用final定义变量，用来表示圆周率并赋值为3.14
        final double pi = 3.14;

        //再使用3个变量分别保存圆的半径，分别赋值为1.2、2.5、6
        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 6;

        //使用计算表达式求它们的面积
        double area1 = pi * radius1 * radius1;
        double area2 = pi * radius2 * radius2;
        double area3 = pi * radius3 * radius3;

        //并输出显示半径和面积值
        System.out.println("半径:" + radius1 +"的圆的面积是:" + area1);
        System.out.println("半径:" + radius2 +"的圆的面积是:" + area2);
        System.out.println("半径:" + radius3 +"的圆的面积是:" + area3);
    }


}