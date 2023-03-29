package Day2.Day2;

/*
1. 定义三个int类型变量,x,y,z，随意赋值整数值
2. 定义一个int类型变量max，先存储x与y中的最大值（使用三元运算符）
3. 再次对max赋值，让它等于上面max与z中的最大值（使用三元运算符）
4. 输出结果
*/

public class Homework8 {
    public static void main(String[] args){
        int x,y,z;
        x = 10;
        y = 20;
        z = 30;

        int max = (x > y) ? x : y;
        max = (max > z) ? max : z;

        System.out.println(x + "," + y + "," + z + "中的最大值是:" + max);

    }

}