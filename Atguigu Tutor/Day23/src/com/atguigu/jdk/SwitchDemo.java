package com.atguigu.jdk;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class SwitchDemo {
    int i;

    @Before
    public void before() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入1~12的数字:");
        i = scanner.nextInt();
        scanner.close();
    }

    @Test
    public void testSwitch1() {
        switch (i) {
            case 3:
            case 4:
            case 5:
                int m = 5;
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }

    @Test
    public void testSwitch2() {
        // 多个case,可以只写一个，使用 逗号连接
        // 如果使用的是 : break不能省略，如果省略会穿透
        switch (i) {
            case 3, 4, 5:
                System.out.println("春天");
                break;
            case 6, 7, 8:
                System.out.println("夏天");
                break;
            case 9, 10, 11:
                System.out.println("秋天");
                break;
            case 12, 1, 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }


    }


    @Test
    public void testSwitch3() {
        // switch里可以使用 -> 表示, 使用了->以后break可以不写
        // 如果 -> 后面大括号里只有一行代码,{}可以省略
        switch (i) {
            case 3, 4, 5 -> System.out.println("春天");
            case 6, 7, 8 -> System.out.println("夏天");
            case 9, 10, 11 -> System.out.println("秋天");
            case 12, 1, 2 -> System.out.println("冬天");
            default -> System.out.println("输入有误");
        }
    }

    @Test
    public void testSwitch4() {
        // switch 语句执行完成以后也可以得到一个结果
        String season = switch (i) {
            case 3, 4, 5 -> "春天";
            case 6, 7, 8 -> {
                System.out.println("hello");
                yield "夏天";  // 在switch表达式里，使用yield返回switch的执行结果
            }
            case 9, 10, 11 -> "秋天";
            case 12, 1, 2 -> "冬天";
            default -> "输入有误";
        };
        System.out.println(season);
    }

    @Test
    public void testSwitch5() {
        /*Object o = Integer.parseInt("4");
        String x = switch (o) {
            case Integer i -> "Integer" + i;
            case Long l -> "Long" + l;
            case Double d -> "Double" + d;
            case String s -> "String" + s;
            default -> o.toString();
        };
        System.out.println(x);*/
    }
}
