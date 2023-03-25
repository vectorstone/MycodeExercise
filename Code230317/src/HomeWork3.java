import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: 保存全班每个组的成绩, 并对成绩做统计
 * @Author: Gavin
 * @Date: 3/17/2023 6:26 PM
 */
/*
需求：保存全班的每个组的成绩，并对成绩做统计
1. 从键盘输入一共有几组
2. 从键盘输入每一组分别有多少人
3. 从键盘输入每一个同学的成绩
4. 统计每一组的最高分、最低分
5. 统计每一组的平均分
6. 统计全班的最高分、最低分
7. 统计全班的平均分
8. 统计全班的总人数
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //键盘录入一共有多少组
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一共有几组:");
        int group = input.nextInt();

        //创建二维数组用来保存成绩,多少组是行,每组多少人的成绩是列
        double[][] arr = new double[group][];

        //使用循环,将键盘录入的每组的人数来初始化数组的列
        for (int i = 0; i < group; i++) {
            System.out.print("请输入第" + (i + 1) + "组的人数:");
            int x = input.nextInt();
            arr[i] = new double[x];
        }
//        System.out.println(Arrays.deepToString(arr));
        //再使用循环,将键盘录入的同学的分数存入对应的列当中
        //循环嵌套,外循环负责第几组
        for (int i = 0; i < arr.length; i++) {
            //内循环负责本组内的第几个同学
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("请输入第" + (i+1) + "组," + "第" + (j + 1) + "位同学的成绩:");
                double score = input.nextDouble();
                verifyScore(score);
                arr[i][j] = score;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        //每一组的最高分,循环遍历输出每组中的最高分
        for (int i = 0; i < group; i++) {
            System.out.println("第" + (i + 1) + "组中的最高分是:" + groupMaxScore(i,arr));
        }
        //每一组的最低分
        for (int i = 0; i < group; i++) {
            System.out.println("第" + (i + 1) + "组中的最低分是:" + groupMinScore(i,arr));
        }
        //每一组的平均分
        for (int i = 0; i < group; i++) {
            System.out.println("第" + (i + 1) + "组中的平均分是:" + groupAverageScore(i,arr));
        }
        //全班的最高分(循环嵌套,求出最高分)
        double classHigh = arr[0][0];
            //外循环控制第几组
        for (int i = 0; i < arr.length; i++) {
                //内循环控制该组内对应成员的遍历
            for (int j = 0; j < arr[i].length; j++) {
                if (classHigh < arr[i][j]) classHigh = arr[i][j];
            }
        }
            //输出全班最高分
        System.out.println("全班最高分是:" + classHigh);

        //全班的最低分
        double classLow = arr[0][0];
        //外循环控制第几组
        for (int i = 0; i < arr.length; i++) {
            //内循环控制该组内对应成员的遍历
            for (int j = 0; j < arr[i].length; j++) {
                if (classLow > arr[i][j]) classLow = arr[i][j];
            }
        }
        //输出全班最低分
        System.out.println("全班最低分是:" + classLow);
        //统计全班总人数
        int totalPeople = 0;
        for (int i = 0; i <arr.length; i++) {
                totalPeople += arr[i].length;
        }
        System.out.println("全班总人数是: " + totalPeople);
        //全班的平均分
        double average = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("全班平均分是:" + (sum /totalPeople ));

        input.close();
    }
    //写一个判断输入分数合法性的方法(后面有时间再想)
    public static void verifyScore (double a) {
        if (a < 0 || a > 100) {
            System.out.println("您输入的成绩不合格,请重新输入");
            System.exit(0);
        }
        return ;
    }
    //写个方法,用来获取每组中成绩的最高分
    public static double groupMaxScore (int a,double[][] arr){
        double max = arr[a][0];
        for (int i = 0; i < arr[a].length; i++) {
            if ( max < arr[a][i]) max = arr[a][i];
        }
        return max;
    }
    //写个方法,用来获取每组中成绩的最低分
    public static double groupMinScore (int a,double[][] arr){
        double min = arr[a][0];
        for (int i = 0; i < arr[a].length; i++) {
            if ( min > arr[a][i]) min = arr[a][i];
        }
        return min;
    }
    //写个方法,用来获取每组中成绩的平均分
    public static double groupAverageScore (int a,double[][] arr){
        double sum = 0;
        for (int i = 0; i < arr[a].length; i++) {
            sum += arr[a][i];
        }
        return (sum / arr[a].length);
    }
}
