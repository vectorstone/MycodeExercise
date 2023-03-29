/*


*        j=1,?=1
***      j=2,?=3
*****    j=3,?=5
*******  j=4,?=7
*********j=5,?=9

1
222
33333
4444444
555555555

++++1    j=1,?=4
+++222   j=2,?=3
++33333  j=3,?=2
+4444444 j=4,?=1
555555555
*/
public class PrintTriangle {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= 5 - j; k++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * j - 1; i++) {  // 内循环
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
