import org.junit.Test;

import java.util.function.BiFunction;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 8:16 PM
 * 测试lambda表达式中BiFunction接口的使用方法
 */
public class BiFunctionTest {
    public void calculate(int a, int b, BiFunction<Integer, Integer, Integer> bifunction) {
        int c = bifunction.apply(a, b);
        System.out.println(c);
    }

    @Test
    public void TestCalculate() {
        /*calculate(2, 5, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a * b;
            }
        });*/
        // 简化的写法
        calculate(2, 5, (Integer a, Integer b) -> a * b);
    }
}
