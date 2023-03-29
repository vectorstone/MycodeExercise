/*
打印九九乘法表
*

*********
*********
*********
*********
*********
*********
*********
*********
*********

*
**
***
****
*****
******
*******
********
*********

1*1=1
1*2=2  2*2=4
1*3=3  2*3=6 3*3=9
.....  ..... ..... .....
*/
public class PrintGraphic {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {  // 外循环控制行数
            /*
            当j=1,?=1
            当j=2,?=2
            */
            for (int i = 1; i <= j; i++) { // 内循环控制每一行的个数
                // System.out.print(i + "*" + j + "=" + i * j + "\t");
                System.out.printf("%d*%d=%-4d", i, j, i * j);
                // System.out.print(i);
                // System.out.print(j);
            }
            System.out.println();
        }
    }
}
