/*
打印菱形图形
 */
public class HomeWork4_7 {
    public static void main(String[] args) {
        //先来生成菱形的上半部分
        //外循环控制上半部分图形的总行数
        for(int i = 1;i <=5 ; i++){

            //内循环1: 输出+ 或 空格
            for(int k = 1; k <= 10-2*i;k++){
                System.out.print("  ");//两个空格
            }
            //内循环2: 输出 *
            for(int j = 1; j <= 2*i - 1;j++){
                if(j == 1 || j == 2*i-1) System.out.print("*   ");//四个字符
                else System.out.print("    ");//四个空格

            }
            System.out.println();
        }
        //---------------------打印下半部分
        //外循环控制总行数,4行
        for(int n = 1;n <= 4;n++){

            //内循环1:负责打印空格
            for(int m = 1;m <= 2 * n ;m++){
                System.out.print("  ");//两个空格

            }
            //内循2:负责打印每行的*
            for(int l = 1;l <= 9-2*n;l++){
                if(l == 1 || l == 9-2*n) System.out.print("*   ");//四个字符
                else System.out.print("    ");//四个空格

            }

            System.out.println();
        }
    }
}


