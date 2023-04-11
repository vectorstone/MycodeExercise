/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 9:55 PM
 */
public class IgnoreTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("rap");
                }
            }
        }).start();
        //可以简写成,因为没有参数,所以()不能省略
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("rap");
            }
        }).start();
    }
}
