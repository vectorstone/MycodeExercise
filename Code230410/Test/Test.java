/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/10/2023 8:24 PM
 */
public class Test {
    @org.junit.Test
    public void test(){
        int getsome = getsome(3, 5);
        System.out.println(getsome);
    }
    public int getsome(int a,int b){
        return a + b;
    }
}
