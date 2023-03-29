package Day2.Day2;

/*
案例：今天是周2，100天以后是周几？

1. 定义一个int类型变量week，赋值为2
2. 修改week的值，在原值基础上加上100
3. 修改week的值，在原值基础上模以7
4. 输出结果，在输出结果的时候考虑特殊值，例如周日
*/
public class Homework7 {
    public static void main(String[] args){
        int week = 2;
        week += 100;
        week %= 7;

        String result = (week == 0) ? "今天是周2,100天以后是周日" : ("今天是周2,100天以后是周" + week);
        System.out.println(result);
    }

}