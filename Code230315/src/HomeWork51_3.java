/*
案例需求：
（1）要求使用char数组存储26个英文字母，并分别用正序和逆序方式显示输出。
（2）要求每10个字母一行。
 */
public class HomeWork51_3 {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        //遍历将英文字母存进去
        alphabet[0] = 'A';
        for (int i = 0; i < 25; i++) {
            alphabet[i + 1] =(char)(alphabet[i] + 1);
            /*
            alphabet[i + 1] =(char)(alphabet[i] + 1);
            这一行也可以这么写
            for(int i = 0; i < chars.length; i++){
            chars[i] = 97 + i;
            }

             */
        }
        //正序显示输出
        for (int i = 0; i < alphabet.length; i++) {
            if (((i+1)% 10) == 0 || i == alphabet.length - 1) System.out.println(alphabet[i]);
            else System.out.print(alphabet[i] + ", ");
        }
        System.out.println("--------------------我是分割线--------------------");
        //逆序显示
        int count = 1;
        for (int j = alphabet.length - 1; j >= 0 ; j--) {
                if (count % 10 == 0 || count == 26) System.out.println(alphabet[j]);
                else System.out.print(alphabet[j] + ", ");
            count++;
        }
    }
}
