/*
生成6位验证码，验证码由数字和大小写字母组成  26 + 26 + 10 = 62
 */
public class Homework3 {
    public static void main(String[] args) {
        // char[] words = {'a','b','c'};
        // char[] words = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        char[] words = new char[62];
        /*for (int i = 0; i < 26; i++) {
            words[i] = (char) ('a' + i);
        }

        for (int i = 26; i < 52; i++) {
            words[i] = (char) (i - 26 + 'A');
        }

        for (int i = 52; i < words.length; i++) {
            words[i] = (char) (i - 52 + '0');
        }*/
        for (int i = 0; i < words.length; i++) {
            if (i < 26) {
                words[i] = (char) ('a' + i);
            } else if (i < 52) {
                words[i] = (char) (i - 26 + 'A');
            } else {
                words[i] = (char) (i - 52 + '0');
            }
        }

        for (int j = 0; j < 100; j++) {
            String code = "";
            for (int i = 0; i < 6; i++) {
                int index = (int) (Math.random() * words.length);  // [0,words.length-1]的随机浮点数
                code += words[index];
            }
            System.out.println(code);
        }

    }
}
