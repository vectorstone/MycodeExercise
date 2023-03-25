/**
 * @Description: 方法
 * @Author: Gavin
 * @Date: 3/17/2023 2:33 PM
 */
/*
方法三要素:  返回值类型声明  方法名   参数列表

方法名:  遵守命名规则与规范，和变量一样遵守驼峰命名法
    第一个单词首字母小写，以后每个单词首字母都大写
    方法名要顾名思义: 通常使用动词 或者 动名词   tellStory() / eat() / getName()

参数:
    定义在方法声明上的参数，我们称之为形式参数，简称形参。形参只起占位的作用，保证逻辑的完整性
    方法声明时，()里传入的参数我们称之为实际参数，简称实参。实参才是参与逻辑运行的真正的值
*/
public class MethodDemo {
    public static void main(String[] args) {
        tellStory("庙", "老和尚", "小和尚");

        System.out.println("-------------------------");
        tellStory("道观", "老道", "道童");

        System.out.println("-------------------------");
        tellStory("尼姑庵", "师太", "小尼姑");

        sum(2, 5);
        System.out.println(sum(4, 9));
    }

    public static void tellStory(String place, String p1, String p2) {
        System.out.println("从前有座山");
        System.out.println("山上有个" + place);
        System.out.println(place + "里有个" + p1);
        System.out.println("还有一个" + p2);
        System.out.println(p1 + "在给" + p2 + "讲故事");
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}

