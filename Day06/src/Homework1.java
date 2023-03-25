import java.util.Arrays;

/*
生成扑克牌
*/
public class Homework1 {
    public static void main(String[] args) {
        String[] flowers = {"黑桃", "红桃", "梅花", "方块"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] cards = new String[flowers.length * nums.length + 2];

        /*int k = 0;
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                cards[k] = flowers[i] + nums[j];
                k++;
            }
        }*/
        /*int k = 0;
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                cards[k++] = flowers[i] + nums[j];
            }
        }*/
        /*int k = 0;
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < nums.length; j++,k++) {
                cards[k] = flowers[i] + nums[j];
            }
        }*/
        for (int i = 0, k = 0; i < flowers.length; i++) {
            for (int j = 0; j < nums.length; j++, k++) {
                cards[k] = flowers[i] + nums[j];
            }
        }
        cards[cards.length - 2] = "小王";
        cards[cards.length - 1] = "大王";

        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i] + "   ");
            if ((i + 1) % 13 == 0) System.out.println();
        }
    }
}
