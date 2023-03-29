package Day2.Day2;

/*
案例：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？

步骤：

1. 定义一个int类型变量hours，赋值为89
2. 定义一个int类型变量day，用来保存89小时中天数的结果
3. 定义一个int类型变量hour，用来保存89小时中不够一天的剩余小时数的结果
4. 输出结果

![image-20220615144339569](imgs/image-20220615144339569.png)
*/
public class Homework5 {
    public static void main(String[] args){
        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;

        System.out.println("为抵抗洪水,战士连续作战89小时:" + "\n" + hours + "是" + day + "天" + hour + "小时");

    }

}