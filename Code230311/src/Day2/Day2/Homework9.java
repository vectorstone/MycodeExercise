package Day2.Day2;

/*
1. 定义一个int类型变量year，赋值为今年年份值
2. 定一个一个boolean类型变量，用来保存这个年份是否是闰年的结果
3. 输出结果

提示闰年的判断标准是：

?       1）年份year，可以被4整除，但不可以被100整除

?       2）或者，可以被400整除
*/
public class Homework9 {
    public static void main(String[] args){
        int year = 2023;
        boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);



        System.out.println(year + "是闰年吗?" + result);

    }

}