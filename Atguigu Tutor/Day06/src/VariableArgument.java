/*
当一个方法的参数个数不确定时，可以考虑使用数组作为方法的参数
可变参数(数据类型...参数名)的本质就是数组

可变参数是数组的语法糖，可以直接传入多个参数，不用手动的创建数组

注意事项:
    1. 一个方法里最多只能有一个可变参数,而且这个可变参数必须要在参数列表的最后面
    2. 可变参数需要注意方法的重载。
*/
public class VariableArgument {
    public static void main(String[] args) {
        int a = getSum(2, 3);
        System.out.println(a);

        // int b = getSum(new int[]{4, 5, 6, 7, 8});
        int b = getSum(4, 5, 6, 7, 8);
        System.out.println(b);

        // test(5);
        test(new int[]{5});
        test(5, new int[]{});

        // test(5,6);
        test(new int[]{5, 6});
        test(5, new int[]{6});
        test(5, 6, new int[]{});
    }

    public static void test(int... nums) {
    }

    public static void test(int a, int... nums) {
    }

    public static void test(int a, int b, int... nums) {
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    /*public static int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }*/

    public static int getSum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    // public static void test(int...nums,String...strs){}
    // public static void test(String...words,int a) {}

}
