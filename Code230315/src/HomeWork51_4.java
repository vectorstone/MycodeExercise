import java.util.Arrays;

/*
案例需求：随机生成一组验证码，验证码由大小写字母和10个阿拉伯数字字符中的任意6位组成。
开发提示：
1、声明一个char[]数组，长度为62，并存储26个小写字母、26个大写字母、10个阿拉伯数字字符
2、随机生成6位下标，下标范围是[0,62)，取出该下标对应的字符，把它们拼接成一个6位字符构成的验证码
 */
public class HomeWork51_4 {
    public static void main(String[] args) {
        /*
        或者可以这样
        char[] words = "abcdefghijklmnopqrstuvwxyzABCD....7890".toCharArray()
        通过words.toCharArray()可以根据字符串words得到要给char[]类型的数组
        */
        char[] code = new char[62];
        //填充大写字母
        code[0] = 'A';
        for (int i = 0; i < 26; i++) {
            code[i + 1] =(char)(code[i] + 1);
        }
        //填充小写字母
        code[26] = 'a';
        for (int i = 26; i < 52; i++) {
            code[i + 1] =(char)(code[i] + 1);
        }
        //填充数字
        code[52] = '0';
        for (int i = 52; i < 61 ; i++) {
            code[i + 1] =(char)(code[i] + 1);
        }
        /*
        或者可以一个循环搞定
        code[0] = 'A';
        code[26] = 'a';
        code[52] = '0';
        for (int i = 0; i < code.length; i++){
        if ( i < 26){
        code[i + 1] =(char)(code[i] + 1);
        }else if (i >= 26 && i < 52)
        code[i + 1] =(char)(code[i] + 1);
        }else{
        code[i + 1] =(char)(code[i] + 1);
        }
         */
        System.out.println(Arrays.toString(code));

        //获取随机数公式获取一个[a,b]范围的随机整数?随机数公式
        //	(int)(Math.random() * (b - a + 1)) + a
        //[0,61]

        //生成六位字符验证码
        String randomCode = "";
        for (int i = 0; i < 6; i++) {
            //先生成随机数
            int random = (int)(Math.random() * 62);
            randomCode += code[random];
        }
        System.out.println(randomCode);
    }
}
