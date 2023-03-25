/*
案例需求：大乐透（前区“35选5”＋后区“12选2”），即前区在1-35之间的号码中随机选取5个，
后区在1-12之间的号码中随机选取2个，组成一期的中奖号码，请用程序模拟产生一组大乐透中奖号码。
开发提示：
- 声明一个int类型的数组front，长度为35，默认值都是0；
- 声明一个int类型的数组after，长度为12，默认值都是0；
- 随机产生[0,35）之间的整数。如果随机产生的是0，那么就把front[0]修改为1，
如果随机产生的是5，那么就把front[5]修改为1，如果随机产生的是10，就把front[10]修改为1。
但是如果本次随机产生的是5，而front[5]已经是1了，那么需要重新随机产生一个整数。
用这种方式把front数组的5个元素修改为1。

- 随机产生[0,12）之间的整数。使用同样的方式，把after数组的2个元素修改为1。
- 遍历front和after数组，输出大乐透中奖号码，判断front和after数组元素是否为1，
如果为1，就显示它的下标+1值。
 */
public class HomeWork51_7 {
    public static void main(String[] args) {
        //动态初始化front数组
        int[] front = new int[35];
        //动态初始化after数组
        int[] after = new int[12];
//        System.out.println(Arrays.toString(after));
        //获取随机数公式获取一个[a,b]范围的随机整数?随机数公式
        //	(int)(Math.random() * (b - a + 1)) + a
        //随机获取[0,35)之间的正数,即[0,34],并将数组中的5个数修改为1
        int count = 0;
        while(true){
            int frontNum = (int)(Math.random() * 35);
           if (front[frontNum] != 1) {
               front[frontNum] = 1;
               count++;
           }
            System.out.println(count);
           if (count == 5) break;
        }
//        System.out.println(Arrays.toString(front));
        //随机获取[0,12)之间的正数,即[0,31],并将数组中的2个数修改为1
        int count1 = 0;
        while(true){
            int afterNum = (int)(Math.random() * 12);
            if (after[afterNum] != 1) {
                after[afterNum] = 1;
                count1++;
            }
            System.out.println(count1);
            if (count1 == 2) break;
        }
//        System.out.println(Arrays.toString(after));
        int[] good = new int[7];
        //遍历front数组,获取前区大乐透中将号码
        int k = 0;
        for (int i = 0; i < front.length; i++) {
            if (front[i] == 1) {
                good[k] = i + 1;
                k++;
            }

        }
//        System.out.println(Arrays.toString(good));
        //遍历after数组,获取后区大乐透中将号码
        for (int i = 0; i < after.length; i++) {
            if (after[i] == 1) {
                good[k] = i + 1;
                k++;
            }
        }
//        System.out.println(Arrays.toString(good));

        //拼接显示中奖结果
        String num1 = "";
        for (int i = 0; i < good.length; i++) {
            if (i == 4 )num1 += good[i] + "号" + "\n" + "后区中奖的是第";
            else if (i == 6) num1 += good[i] + "号";
            else num1 += good[i] + "号,";
        }
        System.out.println("前区中奖的是第" + num1);
    }
}
