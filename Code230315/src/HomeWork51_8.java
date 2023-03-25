import java.util.Arrays;

/*
案例需求：英语中最长的单词是"pneumonoultramicroscopicsilicovolcanoconiosis"，
意思是“肺尘病，矽肺病”，一共有45个英文字母。现在要求统计这个单词中出现了哪些字母，
以及它们出现的次数，并且找出出现次数最多的字母。
开发提示：
（1）使用String类型的变量words存储英语单词"pneumonoultramicroscopicsilicovolcanoconiosis"
（2）通过word.toCharArray()可以根据字符串word得到一个char[]类型的数组。
其中toCharArray()是String类型提供的系统函数，就像Math.random()等函数一样，后面会学到，
这里先提前用一下。它的作用就是创建一个char[]数组，并把字符串中的每一个字符依次存储到这个char[]数组中。
 （3）声明一个int类型的数组counts，长度为26，分别用来记录26个字母出现的次数，
 counts[0]记录的是'a'字母的次数，counts[1]记录的是'b'字母的次数，依次类推。
 */
public class HomeWork51_8 {
    public static void main(String[] args) {
        //使用String类型的变量words存储英文单词
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
        //通过word.toCharArray()获取一个char[]类型的数组
        char[] vocabulary = word.toCharArray();
//        System.out.println(Arrays.toString(vocabulary));
        //新建counts数组,用来存储每个字母出现的次数
        int[] counts = new int[26];
        //两个变量,外循环控制字母,内循环负责数组的遍历
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < vocabulary.length; j++) {
                //循环判断vocabulary里面等于字母a的数量,有的话,counts[0]就++,依次遍历
                if (vocabulary[j] == i) counts[i-97]++;
            }
        }
        System.out.println(Arrays.toString(counts));
        //输出出现了哪些字母,以及这个字母出现的次数
        for (int i = 0; i <counts.length; i++) {
            if (counts[i] != 0){
                System.out.println("出现了字母: " + (char)('a' + i) + ",出现了" + counts[i] + "次");
            }
        }
        //找出出现次数最多的字母
        int max = 0;
        for (int j = 0; j < counts.length; j++) {
            if (counts[max] < counts[j]){
                max = j;
            }
        }
        System.out.println("出现次数最多的字母是:" + (char)('a'+max) + ",一共出现了"+ counts[max] + "次");
    }
}
