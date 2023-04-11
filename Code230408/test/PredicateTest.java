import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 9:21 PM
 */
public class PredicateTest {
    private<T> void myRemoveIf(List<T> list, Predicate<T> predicate){
        Iterator<T> itr = list.iterator();
        while(itr.hasNext()){
            if(predicate.test(itr.next())){
                itr.remove();
            }
        }
    }
    @Test
    public void TestPredicate(){
        List<String> list = new ArrayList<>();
        list.add("一");
        list.add("一,二");
        list.add("一,二,三");
        list.add("一,二,三,四");
        list.add("一,二,三,四,五");
        for (String s : list) {
            System.out.println(s);
        }
        /*//正常写法
        myRemoveIf(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.length()>5){
                    return true;
                }
                return false;
            }
        });*/
        //简化写法1
        myRemoveIf(list,s->s.length()>5);

        System.out.println("--------------------");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
