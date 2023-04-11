import lambdaSimple.Person;
import org.junit.Test;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/9/2023 10:10 PM
 */
public class TestSimple {
    public void test(int m,int n,B b){
        b.bFunction(m,n);
    }
    @Test
    public void Test(){
        /*test(3, 5, new B() {
            @Override
            public void bFunction(int m, int n) {
                Person.foo(m,n);
            }
        });*/
        test(3,5, Person::foo);

    }

}

@FunctionalInterface
interface B {
    void bFunction(int m,int n);
}