package tiku.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 8:47 PM
 */
public class sushu {
    public static void main(String[] args){

        for(int i = 101;i <= 202;i++){
            boolean flag = true;
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
