import java.util.Scanner;

/*
6、判断年、月、日是否合法
（1）从键盘输入年、月、日，
（2）要求年份必须是正整数，月份范围是[1,12]，日期也必须在本月总天数范围内，
（3）如果输入正确，输出“xxxx年-xx月-xx日”结果，否则提示输入错误。
 */public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入年份:");
        int year = input.nextInt();

        System.out.print("请输入月份:");
        int month = input.nextInt();

        System.out.print("请输入日期:");
        int day = input.nextInt();

        String s = year + "年-" + month + "月-" + day + "日";

        boolean valid = true;//增加一个布尔变量,如果日期不合法,改变这个变量的值,最后判断输出

        if(year > 0){
            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(day > 1 && day < 31) System.out.println(s);
                    else {
                        System.out.println("日期输入有误");
                        valid = false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(day > 1 && day < 30 ) System.out.println(s);
                    else {
                        System.out.println("日期输入有误");
                        valid = false;
                    }
                    break;
                case 2:
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){

                        if(day > 1 && day < 29) System.out.println(s);
                        else {
                            System.out.println("日期输入有误");
                            valid = false;
                        }

                    }else{

                        if(day > 1 && day < 28) System.out.println(s);
                        else {
                            System.out.println("日期输入有误");
                            valid = false;
                        }

                    }
                    break;
                default :
                    System.out.println("月份输入有误");
                    valid = false;
                    break;
            }
        }else{
            System.out.println("年份输入有误");
            valid = false;
        }

        if(valid) System.out.println(s + "是合法的");

        input.close();
    }
}