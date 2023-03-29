/*
for(初始化语句1;判断语句2;循环体执行完成以后的语句3) {
    循环体代码4;
}
*/
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;

        /*int i = 0;
        while (i < 100) {
            i++;
            sum += i;
        }
        System.out.println("i = " + i);*/
        /*for (int i = 0; i <= 100; i++) {  // 1243243243...直到2的条件不满足停止
            sum += i;
        }*/

       /*int j = 0;
        for (; j <= 100; j++) {
            sum += j;
        }*/
        /*for (int i = 0; ; i++) {
            sum += i;
            if (i == 100) break;
        }*/
        for (int i = 0; i < 100; ) {
            i++;
            sum += i;
        }
        // System.out.println(i);  被定义在循环的内部，只能在循环里使用
        System.out.println(sum);
    }
}
