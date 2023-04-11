import org.junit.Test;

import java.util.function.Supplier;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 9:04 PM
 * 测试lambda表达式中的supplier接口,有返回值,没有参数
 */
public class SupplierTest {
    private<T> void myMethod(Supplier<T> supplier){
        T t = supplier.get();
        System.out.println(t);
    }
    @Test
    public void TestSupplier(){
        myMethod(new Supplier<String>() {
            @Override
            public String get() {
                return new String(new byte[] {97,98,99});
            }
        });
        //同样简化版本1
        myMethod(()->new String(new byte[] {97,98,99}));
    }
}
