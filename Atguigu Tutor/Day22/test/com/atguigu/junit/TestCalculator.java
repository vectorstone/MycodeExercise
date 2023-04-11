package com.atguigu.junit;


import org.junit.*;

/*
@Test注解使用的注意事项:
    1. 只能用在方法上
    2. 被 @Test 注解的方法，不能有参数
    3. 方法只能被public修饰
    4. 不能是静态方法

Assert类，用来断言，判断执行的结果和预期的结果是否一致

@Before / @After 注解的方法，在每个@Test注解的测试方法执行之前/之后 都会执行一次

@BeforeClass / @AfterClass 注解的方法，在整个测试类运行之前/之后 会执行一次
这两个注解修饰的方法必须要是 静态方法!
*/
public class TestCalculator {
    Calculator c = new Calculator();

    @BeforeClass
    public static void beforeClass() {
        System.out.println("我是BeforeClass方法");
    }
    @Before
    public void before() {
        System.out.println("我是before方法");
    }

    @Test
    public void testSum() {
        int x = c.sum(2, 5);
        Assert.assertEquals(x, 7);
        System.out.println("TestCalculator.testSum");
    }

    @Test
    public void testDivide() {
        int x = c.divide(10, 2);
        Assert.assertEquals(x, 5);
        System.out.println("TestCalculator.testDivide");
    }

    @Test
    public void testBigger() {
        boolean x = c.isBigger(3, 6);
        Assert.assertFalse(x);
        System.out.println("TestCalculator.testBigger");
    }

    @After
    public void after() {
        System.out.println("我是after方法");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("我是AfterClass方法");
    }
}
