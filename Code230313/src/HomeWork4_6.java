/*
打印如下图形:
o*****o
*o***o*
**o*o**
***o***
**o*o**
*o***o*
o*****o

 */
public class HomeWork4_6 {
    public static void main(String[] args) {
        //外循环控制行数
        for(int i = 1 ; i <= 7; i++){

            //内循环控制每行需要打印的内容
            for(int k = 1; k <= 7; k++){
                //通过if判断来决定什么时候打印* ,什么时候打印O,找规律
                if(i == k || i + k == 8) System.out.print("O");
                else System.out.print("*");

            }
            System.out.println();


        }


    }
}
