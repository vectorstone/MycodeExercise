/*

*         j=0,?=1
***       j=1,?=3
*****     j=2,?=5
*******   j=3,?=7
********* j=4,?=9

*
* * *
* * * * *
* * * * * * *
* * * * * * * * *

++++++++*          j=0,?=8
++++++* * *        j=1,?=6
++++* * * * *      j=2,?=4
++* * * * * * *    j=3,?=2
* * * * * * * * *  j=4,?=0
++* * * * * * *    j=0,?=2
++++* * * * *      j=1,?=4
++++++* * *
++++++++*

* * * * * * *  j=0,?=7
* * * * *      j=1,?=5
* * *          j=2,?=3
*              j=3,?=1

 */
public class PrintDiamond {
    public static void main(String[] args) {
        // 菱形的上半部分
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 8 - 2 * j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 菱形的下半部分
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 2 * (j + 1); k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 7 - 2 * j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        // 菱形的上半部分
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 8 - 2 * j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 2 * j + 1; i++) {
                if (i == 0 || i == 2 * j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // 菱形的下半部分
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 2 * (j + 1); k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < 7 - 2 * j; i++) {
                if (i == 0 || i == 6 - 2 * j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
