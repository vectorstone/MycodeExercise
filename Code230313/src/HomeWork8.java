import java.util.Scanner;

/*
（1）声明变量month和day，用来存储你出生的月份和日期，
（2）判断这个日期属于什么星座，各个星座的日期范围如下：
 */
public class HomeWork8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的生日的月份:");
        int month = input.nextInt();

        System.out.print("请输入你的生日的日期:");
        int day = input.nextInt();
        switch(month){
            case 1:
                if(day <= 19) System.out.println("你是魔羯座");
                else System.out.println("你是水瓶座");
                break;
            case 2:
                if(day <= 18) System.out.println("你是水瓶座");
                else System.out.println("你是双鱼座");
                break;
            case 3:
                if(day <= 20) System.out.println("你是双鱼座");
                else System.out.println("你是白羊座");
                break;
            case 4:
                if(day <= 19) System.out.println("你是白羊座");
                else System.out.println("你是金牛座");
                break;
            case 5:
                if(day <= 20) System.out.println("你是白金牛座");
                else System.out.println("你是双子座");
                break;
            case 6:
                if(day <= 21) System.out.println("你是双子座");
                else System.out.println("你是巨蟹座");
                break;
            case 7:
                if(day <= 22) System.out.println("你是巨蟹座");
                else System.out.println("你是狮子座");
                break;
            case 8:
                if(day <= 22) System.out.println("你是狮子座");
                else System.out.println("你是处女座");
                break;
            case 9:
                if(day <= 22) System.out.println("你是处女座");
                else System.out.println("你是天秤座");
                break;
            case 10:
                if(day <= 23) System.out.println("你是天秤座");
                else System.out.println("你是天蝎座");
                break;
            case 11:
                if(day <= 22) System.out.println("你是天蝎座");
                else System.out.println("你是射手座");
                break;
            case 12:
                if(day <= 21) System.out.println("你是射手座");
                else System.out.println("你是魔羯座");
                break;
            default:
                System.out.println("月份输入有误");
                break;

        }

        input.close();
    }
}
