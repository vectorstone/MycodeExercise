/*
打印X形状
*

*******

*******
*******
*******
*******
*******
*******
*******

O*****O
*O***O*
**O*O**
***O***
**O*O**
*O***O*
O*****O

*/
public class Homework6 {
    public static void main(String[] args) {
        for (int j = 1; j <= 7; j++) {  // 外循环控制行数
            for (int i = 1; i <= 7; i++) {  // 内循环控制每一行*的个数
                // System.out.print(j + "," + i + "   ");  // 打印数字
                if (i == j || i + j == 8) {
                    System.out.print("O");
                } else {
                    System.out.print("*");  // 打印一个*不换行
                }
            }
            System.out.println();

        }

    }
}
