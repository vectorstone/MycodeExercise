import java.util.Scanner;

/*
- 从键盘输入一个单词，存放到一个String类型的变量word中
- 通过word.toCharArray()可以根据字符串word得到一个char[]类型的数组。
  其中toCharArray()是String类型提供的系统函数，就像Math.random()等函数一样，
  后面会学到，这里先提前用一下。它的作用就是创建一个char[]数组，并
  把字符串中的每一个字符依次存储到这个char[]数组中。
  判断数组元素是否首尾对应相等，如果是，那么你输入的单词就是回文单词，否则就不是。
 */
public class HomeWork52_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个单词:");
        String word = input.next();
        char[] words = word.toCharArray();
        //判断数组是否对称
        boolean asymmetry = true;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != words[words.length - 1 - i]) asymmetry = false;
        }
        System.out.println(word + ":" + ((asymmetry) ? "是回文单词" : "不是回文单词"));
    }
}
