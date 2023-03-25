/*
使用循环输出如下数字三角形
1
12
123
1234
12345

或

1
22
333
4444
55555

或

    1
   222
  33333
 4444444
555555555
 */
public class HomeWork4_3 {
    public static void main(String[] args) {
        /*for(int i = 2; i <= 5;i++){
            String s = ""; 为什么这样不行
            System.out.println(s = s + i);
        }*/

       /*
       图案一
       for(int i = 1 ;i <= 5;i++){

            int k = 1;
            for(int j = i;j>0;j--){

                System.out.print(k);
                k++;
            }
            System.out.println();

        }*/

        //图案二

        /*for(int i = 1; i <= 5;i++){
            for(int x = i;x > 0;x--){
                System.out.print(i);
            }
            System.out.println();
        }*/

        //图案三
        //等差数列通项公式an=a1+(n-1)*d
        int k = 5;
        for(int i = 1; i <= k;i++){

            //输出空格
            for(int j = k-i;j>0;j--){
                System.out.print(" ");
            }

            //输出数字
            for(int x = (1+(i-1)*2);x > 0;x--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
