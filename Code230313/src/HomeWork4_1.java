/*
1)输出1-100偶数
2)要求: 每5个偶数一行,一行中的每个偶数数字之间使用逗号分隔
 */
public class HomeWork4_1 {
    public static void main(String[] args) {
        int count = 0;
/*
方式1:使用for循环
            for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                count++;

                if(count % 5 == 0) System.out.println(i);//每5个换行
                else System.out.print(i + ", ");

            }
        }*/

/*    //方式2:使用while循环
        int i = 1;
        while(i <= 100){
            if(i % 2 == 0){
                count++;

                if(count % 5 == 0) System.out.println(i);//每5个换行
                else System.out.print(i + ", ");

            }
            i++;
        }*/

        //方法3:使用do while循环
        int i = 1;
        do{
            if(i % 2 == 0){
                count++;

                if(count % 5 == 0) System.out.println(i);//每5个换行
                else System.out.print(i + ", ");

            }
            i++;
        }while(i <= 100);
    }
}
