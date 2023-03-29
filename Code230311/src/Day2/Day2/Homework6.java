package Day2.Day2;

/*
案例：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
转换公式：℃ = (℉ - 32) / 1.8

1. 定义一个double类型变量hua，存储华氏温度80
2. 定义一个double类型变量she，存储摄氏温度，根据公式求值
3. 输出结果
*/
public class Homework6 {
    public static void main(String[] args){
        double hua = 80;
        double she = (hua - 32) / 1.8;

        System.out.println("华氏度"+ hua + "℉转为摄氏度是:" + she + "℃");

    }
}