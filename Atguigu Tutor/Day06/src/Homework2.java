public class Homework2 {
    public static void main(String[] args) {
        // char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        // char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + i);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if ((i + 1) % 10 != 0 && i != chars.length - 1) {
                System.out.print(",");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[chars.length - 1 - i]);
            if ((i + 1) % 10 != 0 && i != chars.length - 1) {
                System.out.print(",");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
