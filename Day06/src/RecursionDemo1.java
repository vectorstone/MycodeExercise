/*
在demo方法里可以调用test方法
递归调用:在方法A的方法体里，再调用方法A. 递归最重要的就是留好程序的出口(什么情况下停止递归)
*/
public class RecursionDemo1 {
    static int count = 0;

    public static void main(String[] args) {
        tellStory();
    }

    public static void demo() {
        System.out.println("demo开始了");
        test();
        System.out.println("demo结束了");
    }

    public static void test() {
        System.out.println("test开始了");
        System.out.println("test结束了");
    }

    public static void tellStory() {
        count++;
        System.out.println("从前有座山");
        System.out.println("山上有个庙");
        System.out.println("庙里有个老和尚");
        System.out.println("还有一个小和尚");
        System.out.println("老和尚在给小和尚讲故事");
        System.out.println("故事的内容是:");
        /*if (count < 5)
            tellStory();*/
        if (count >= 5) return;
        tellStory();
    }
}
