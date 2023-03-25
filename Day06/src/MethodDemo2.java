/*
方法三要素:  返回值类型声明  方法名   参数列表

方法名:  遵守命名规则与规范，和变量一样遵守驼峰命名法
    第一个单词首字母小写，以后每个单词首字母都大写
    方法名要顾名思义: 通常使用动词 或者 动名词   tellStory() / eat() / getName()

参数:
    定义在方法声明上的参数，我们称之为形式参数，简称形参。形参只起占位的作用，保证逻辑的完整性
    方法声明时，()里传入的参数我们称之为实际参数，简称实参。实参才是参与逻辑运行的真正的值

返回值声明: 在方法体里使用 关键字 return返回方法的执行结果
    void 表示这个方法执行完成以后没有返回值
    方法声明上的返回值类型必须要和方法体里返回的值一致!

return关键字注意事项:
    1. 只能用在方法里，用来表示方法的执行结果。如果遇到return就表示这个方法执行完成了
    2. 一个方法里可以有多个return语句，通常情况下，只会执行一个return语句。
        特殊情况下(在finally语句里)，一个方法的多个return语句都可能会被执行
    3. 方法体里的返回必须要和方法声明上的返回值类型一致!
    4. return 后面也可以没有任何的值，用来表示结束方法
*/
public class MethodDemo2 {
    public static void main(String[] args) {
        tellStory("庙", "老和尚", "小和尚");

        System.out.println("-------------------------");
        tellStory("道观", "老道", "道童");

        System.out.println("-------------------------");
        tellStory("尼姑庵", "师太", "小尼姑");

        int x = sum(2, 5);
        if (x > 10) {
            System.out.println("两个数字相加大于10");
        }

        String message = getMessage(21);
        System.out.println(message);

        getIndex(7, new int[]{4, 9, 2, 1, 3, 5, 6});
    }

    public static void tellStory(String place, String p1, String p2) {
        System.out.println("从前有座山");
        System.out.println("山上有个" + place);
        if (place.equals("庙")) return;
        System.out.println(place + "里有个" + p1);
        System.out.println("还有一个" + p2);
        System.out.println(p1 + "在给" + p2 + "讲故事");
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static String getMessage(int age) {
        if (age >= 18) return "欢迎来到我的网站";
        return "未满十八岁，禁止访问";
    }

    public static int getIndex(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static String getLevel(int score) {
        if (score < 60 && score > 0) {
            return "不及格";
        } else if (score >= 60 && score < 80) {
            return "及格";
        } else if (score >= 80 && score <= 100) {
            return "优秀";
        }
        return "输入有误";
    }
}
