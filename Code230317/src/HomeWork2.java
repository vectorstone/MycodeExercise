/**
 * @Description: 打印扑克牌
 * @Author: Gavin
 * @Date: 3/17/2023 6:09 PM
 */
/*
打印扑克牌,效果如图所示
开发提示:
使用一个两行的二维的字符串数组,分别保存花色和点数
 */
public class HomeWork2 {
    public static void main(String[] args) {
        //花色四种,点数13个
        String[][] poke = new String[2][];
        //将扑克的花色保存到二维数组的第一行
        poke[0] = new String[]{"黑桃","红桃","梅花","方片"};
        //将扑克的点数保存到二维数组的第二行
        poke[1] = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        //循环遍历打印扑克的花色和点数
        int count = 1;
        for (int i = 0; i < poke[0].length; i++) {
            //外循环负责花色
            //内循环负责点数
            for (int j = 0; j < poke[1].length; j++) {
                if (count % 13 == 0 ) System.out.println(poke[0][i] + poke[1][j]);
                else System.out.print(poke[0][i] + poke[1][j] + ", ");
                count++;
            }
        }
    }
}
