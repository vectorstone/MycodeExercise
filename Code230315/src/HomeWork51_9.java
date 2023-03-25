import java.util.Arrays;
import java.util.Scanner;

/*
案例需求：先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，最后统计：
- 本组学员的平均分，
- 低于平均分的学员人数，
- 哪些学员低于平均分，
- 最高分和最低分分别是谁。
 */
public class HomeWork51_9 {
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
                if(value < 0) System.out.println("您输入的分数有误,请重新输入");
                else break;
            }
            score[i] = value;
        }

        //调用显示一下
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(score));

        //本组学员平均分
        int totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        double average = (double)(totalScore / quantity);
        System.out.println("该组学员的平均分数为:" + average);
        //低于平均分的学员人数 以及 哪些学员低于平均分
        int count = 0;
        String lowAverage = "";
        for (int i = 0; i < score.length; i++) {
            if (score[i] < average) {
                count++;
                lowAverage += name[i] + ", ";
            }
        }
        System.out.println("低于平均分的学员人数是:" + count + "人");
        System.out.println("低于平均分的学员是:" + lowAverage);
        //最高分和最低分分别是谁
        int max = 0;
        int min = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[max] < score[i]) max = i;
            if(score[min] > score[i]) min = i;

        }
        System.out.println("最高分的学员是:" + name[max] + ",最低分的学员是:" + name[min]);
        input.close();
    }
}
