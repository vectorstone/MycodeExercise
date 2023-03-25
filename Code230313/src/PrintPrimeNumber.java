//打印[2,200]的所有质数,2也是质数

public class PrintPrimeNumber {
    public static void main(String[] args) {

        boolean valid = true;

       for (int i = 2;i <= 200;i++){

           for (int j = 2;j <= Math.sqrt(i);j++){
               if (i % j == 0) {
                   valid = false;
                   break;
               } valid = true;
           }

           if (valid) System.out.println(i);



       }
    }
}
