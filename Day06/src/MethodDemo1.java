/*
方法是对语句的封装，将功能相对独立的代码打包成为一个整体，提高代码的重用率
提高代码的维护性和灵活性

方法声明的语句:
[public] [static] 返回值类型声明 方法名(参数列表) {
    方法体;
}
方法定义的三要素:   返回值类型声明   方法名    参数列表

方法只定义并不会自动执行，需要手动调用才能执行方法
方法调用的语法:   方法名(参数列表);
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        tellStory();
        tellStory();
        tellStory();
        tellStory();
        tellStory();
    }

    public static void tellStory() {
        System.out.println("从前有座山");
        System.out.println("山上有个庙");
        System.out.println("庙里有个老和尚");
        System.out.println("还有一个小和尚");
        System.out.println("老和尚在给小和尚讲故事");
    }
}



