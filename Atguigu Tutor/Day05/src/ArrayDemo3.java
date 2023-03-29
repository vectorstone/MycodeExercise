public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
         如果数组没有指定内容，数组里的元素有默认值
         默认值和数组的数据类型有关

         byte/short/int/long 数组，元素默认值是 0
         char 数组，元素默认是 编码为0的字符，也就是空字符
         boolean 数组，元素默认值是 false
         float / double 数组，元素默认值是 0.0
         引用数据类型数组，元素默认值是 null,表示空对象

         数组里存储的元素是兼容类型:  int类型的数组可以存入一个byte类型的值
         Animal类型的数组，可以放入一个Dog类型的对象
         */
        byte[] arr1 = new byte[5];
        short[] arr2 = new short[5];
        int[] arr3 = new int[5];
        long[] arr4 = new long[5];
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);
        System.out.println(arr3[1]);
        System.out.println(arr4[1]);

        arr3[0] = 5;
        byte b = 6;
        arr3[3] = b;

        char[] arr5 = new char[5];
        char c = arr5[0];
        System.out.println((int) c);

        boolean[] arr6 = new boolean[5];
        System.out.println(arr6[0]);

        float[] arr7 = new float[5];
        double[] arr8 = new double[5];
        System.out.println(arr7[0]);
        System.out.println(arr8[0]);

        String[] names = new String[5];
        System.out.println(names[0]);
    }
}
