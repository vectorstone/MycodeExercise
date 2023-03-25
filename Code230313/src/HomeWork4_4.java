import java.util.Scanner;

/*
## 4、计算这一天是这一年的第几天
案例需求：从键盘分别输入年、月、日，使用循环for+if实现，判断这一天是当年的第几天
开发提示：
（1）每个月总天数如下：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
 （2）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或年份year可以被400整除
 */
public class HomeWork4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = input.nextInt();

        System.out.print("请输入月份:");
        int month = input.nextInt();

        System.out.print("请输入今天是本月的多少号:");
        int day = input.nextInt();

        /*//方式一:只使用了for循环,没有使用if判断
        int arr[] = {0,31,28,31,30,31,30,31,31,30,31,30};
        arr[2] = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) ? 29 : 28 ;

        int sumDay = 0;
        for(int i = 1;i<=month;i++){
            sumDay += arr[i-1] ;

        }
        sumDay += day;
        System.out.println(year + "年"+month+"月"+day+"日,是今年的第"+ sumDay+"天");*/
        //判断月份输入是否正确
        if(month <= 0 || month > 12) System.out.println("您输入的月份有误");

        //定义总天数
        int sumDay = 0;

        //判断是否是闰年,如果是闰年将2月份定义为29天,如果不是,将2月份定义为28天
        int month2 = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) ? 29 : 28;

        //循环求和总天数
        for(int i =1;i < month;i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                if(day >= 0 && day <= 31)sumDay += 31;
                else System.out.println("您输入的天数不正确");
            }
            else if(i == 4 || i == 6 || i == 9 || i == 11){
                if(day >= 0 && day <= 30) sumDay += 30;
                else System.out.println("您输入的天数不正确");
            }
            else {
                if(day >= 0 && day <= month2) sumDay += month2;
                else System.out.println("您输入的天数不正确");
            }
        }
        sumDay += day;
        System.out.println(year + "年"+month+"月"+day+"日,是今年的第"+ sumDay+"天");

        input.close();
    }
}
