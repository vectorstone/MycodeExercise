import java.util.Arrays;

/*
 统计字符出现的次数  "pneumonoultramicroscopicsilicovolcanoconiosis"
  {'a':2,'c':6...}  Map结构实现
*/
public class Homework5 {
    public static void main(String[] args) {
        char[] words = "pneumonoultramicroscopicsilicovolcanoconiosis".toCharArray();
        int[] counts = new int[26];

        for (int i = 0; i < words.length; i++) {
            /*if (words[i] == 'a') {
                counts[0]++;
            }else if (words[i] == 'b') {
                counts[1]++;
            }*/
            counts[words[i] - 'a']++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)
                System.out.println((char) (i + 'a') + "=" + counts[i]);
        }
    }
}
