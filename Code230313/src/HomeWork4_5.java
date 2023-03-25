import java.util.Scanner;

/*
3天打鱼,2天晒网升级版
案例需求：
（1）假设从2000年1月1日开始三天打鱼，两天晒网，
（2）从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
（3）开发提示：
- 先计算这一天是这一年的第几天，即总天数
- 再用总天数 % 5（三天打鱼两天晒网的周期），根据结果来判断是打鱼还是晒网
（4）每个月总天数：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
（5）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除
 */
public class HomeWork4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


/*        int year,month,day;
        while(true) {
            System.out.print("请输入年份:");
            year = input.nextInt();
            if(year >= 2000) break;
            else System.out.println("输入的年份必须大于等于2000年");
        }

        while(true){
            System.out.print("请输入月份:");
            month = input.nextInt();
            if (month > 0 && month <= 12) break;
            else System.out.println("输入的月份不合法");
        }*/
        System.out.print("请输入年份:");
        int year = input.nextInt();

        System.out.print("请输入月份:");
        int month = input.nextInt();

        System.out.print("请输入日期:");
        int day = input.nextInt();

        //计算闰年和平年的完整天数
        int month2 = 28;

        boolean leap = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0);

        if(leap) month2 = 29;

//        int wholeDays = 31 + month2 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31;

        //用来确定推出的时间
        boolean valid = true;

        //计算当今天是今年的多少天,并判断是否合法
        int sumDays = 0;
        if(year >= 2000){


            //这个地方 i <= month 如果不加=,那么无法判断日期和月份是否正确,如果加了=,那么会多加1月的31天,最好的办法,将判断日期和月份的逻辑拉出来
           for (int i = 1; i <= month; i++){

               if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ){
                   if(day <= 0 || day > 31) {
                       System.out.println("您输入的日期有误");
                       valid = false;
                   }
                       else sumDays += 31;


               }else if(i == 4 || i == 6 || i == 9 || i == 11){
                   if(day <= 0 || day > 30) {
                       System.out.println("您输入的日期有误");
                       valid = false;
                   }
                   else sumDays += 30;


               }else if(i == 2){
                   if(day <= 0 || day > month2) {
                       System.out.println("您输入的日期有误");
                       valid = false;
                   }
                   else sumDays += month2;


               }else{
                   System.out.println("您输入的月份有误,请重新输入");
                   valid = false;
               }

           }

           sumDays += day;




        }else{
            System.out.println("您输入的年份有误");
            valid = false;
        }


        //判断一共有多少年,并统计整年的天数
        int yearDays = 0;
        for(int i = 2000;i < year;i++ ){
            if(i % 4 == 0 && i % 100 != 0 || i % 100 == 0) yearDays += 366;
            else yearDays += 365;
        }

        //判断今天是应该打渔还是晒网  1,2,3打鱼, 4,0晒网
        //总天数
        if(valid){
            int x = (yearDays + sumDays - 31) % 5;
            System.out.println(yearDays + sumDays - 31);
            if( x == 3 || x == 1 || x == 2) System.out.println("今天适合打鱼");
            else System.out.println("今天适合晒网");
        }

        input.close();
    }
}
