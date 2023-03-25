import java.util.Arrays;
import java.util.Scanner;

/*
案例需求：先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，
显示学员姓名和成绩。最后查找是否有满分(100)学员，
如果有显示姓名，否则显示没有满分学员。

 */
public class HomeWork52_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //确定人数以及合规性判断
        int quantity;//不能定义到下面的while循环里面,否则数组长度无法调用这个变量
        while(true){
            System.out.print("请输入学员总人数:");
            quantity = input.nextInt();
            if (quantity <= 0) System.out.println("人数输入有误,请重新输入");
            else break;
        }

        //创建数组保存学员姓名和成绩,数组长度就是上一步输入的人数
        String[] name = new String[quantity];
        double[] score = new double[quantity];
        double value;

        //for循环实现循环录入学生的姓名和考试成绩
        for (int i = 0; i < quantity; i++) {
            //姓名不用判断是否合规
            System.out.print("请输入学员的姓名:");
            name[i] = input.next();
            //while循环判断分数是否合规(不能是负的分数)
            while(true){
                System.out.print("请输入该学员对应的分数:");
                value = input.nextDouble();
                if(value < 0 || value > 100/*增加1超过100分提示输入错误的内容*/) System.out.println("您输入的分数有误,请重新输入");
                else break;
            }
            score[i] = value;
        }
        //调用显示一下
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(score));
        //查找是否有100分的学生
        boolean result = true;
        String list = "";
        for (int i = 0; i < score.length; i++) {
            if (score[i] == 100){
                list += name[i] + ",";
                result = false;
            }
        }
        if (result){
            System.out.println("没有找到100分的学员");
        }else {
            System.out.println("满分的学员是:" + list);
        }
    }
}
