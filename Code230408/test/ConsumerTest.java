import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 8:41 PM
 * Consumer有参数没有返回值,抽象方法是accept(T t)
 */
public class ConsumerTest {
    List<String> list = new ArrayList<>();
    private<T> void myForEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }


    }
    @Test
    public void TestMyForEach(){
        List<String> list = new ArrayList<>();
        list.add("一");
        list.add("一二");
        list.add("一二三四");
        list.add("一二三四五");
        list.add("一二三四五六");
        /*myForEach(list, new Consumer<String>() {
            @Override
            public void accept(String s) {
                if(s.length()>5){
                    System.out.println(s);
                }
            }
        });*/
        //简写版本
        myForEach(list,(String x) ->{
            if(x.length()>5){
                System.out.println(x);
            }
        } );
    }
}
