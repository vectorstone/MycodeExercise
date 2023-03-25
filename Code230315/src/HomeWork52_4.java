import java.util.Scanner;

/*
案例需求：公司年会有一个寻找锦鲤的游戏，每一个员工随意写一个字，如果在“锦鲤”词库中有这个字，
那么就奖励500元锦鲤红包，否则就没有，每人只能玩一次。
现有锦鲤字库如下，它们按照Unicode编码值从小到大排序：
char[] koiFishWords = {'一','今','地','定','尚','年','开','我','果','火','爱','硅','结','花','谷','遍'};
 开发提示：
（1）使用顺序查找
（2）使用二分查找：效率更高，因为koiFishWords是有序的数组
 */
public class HomeWork52_4 {
    public static void main(String[] args) {
        char[] koiFishWords = {'一','今','地','定','尚','年','开','我','果','火','爱','硅','结','花','谷','遍'};
        Scanner input = new Scanner(System.in);
        System.out.print("请任意输入一个汉字:");
        char word = input.next().charAt(0);

        int start = 0;
        int end = koiFishWords.length - 1;
        boolean result = true;
        while(start <= end){
           int middle = (start + end) >> 1;
           if (word > koiFishWords[middle]){
               start = middle + 1;
           }else if (word < koiFishWords[middle]) {
               end = middle - 1;
           }else {
               System.out.println("恭喜您获得500元锦鲤红包");
               result = false;
               break;
           }
        }
        if (result)System.out.println("很抱歉,您没有中奖");
        input.close();
    }
}
