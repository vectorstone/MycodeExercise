/**
 * @Description: 不死神兔参考答案
 * @Author: Gavin
 * @Date: 3/17/2023 10:35 PM
 */
/*

 */
public class NoDieRabbit {

        public static void main(String[] args) {
            int count = getCount(4);
            System.out.println(count);
        }

        public static int getCount(int n) {
            if (n == 1 || n == 2) return 1;
            return getCount(n - 2) + getCount(n - 1);
        }
    }

