/*
打印扑克牌需求
（1）用第一个数组保存扑克牌的所有花色：黑桃、红桃、梅花、方片
（2）用第二个数组保存具有以上花色的数字：2-K
（3）用第三个数组保存扑克牌的牌面
（4）嵌套遍历第1个、第2个数组，排列组合生成扑克牌牌面，并把结果放到第3个数组的元素中
（5）单独考虑大王小王
（6）遍历输出
 */
public class HomeWork51_2 {
    public static void main(String[] args) {
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        String[] combination =new String[54];
        combination[52] = "小王";
        combination[53] = "大王";

        int count = 0;
        for (int i = 0; i < color.length; i++) {

            for (int j = 0; j < number.length; j++) {
                /*combination[count] = color[i] + number[j];
                count++;*/
                combination[count++] = color[i] + number[j];//count++,先赋值再自增
            }
        }
        //按照给定格式遍历
            for (int i = 0; i < combination.length; i++) {
            if ((i + 1) % 13 == 0 ) /*这个地方是每13个(一个花色)换一次行的意思*/System.out.println(combination[i]);
            else System.out.print(combination[i] + " ");
        }
    }
}
