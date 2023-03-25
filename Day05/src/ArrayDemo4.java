/*
数组的长度和下标
长度: 数组的length属性用来表示数组的长度
下标: 从0开始,最多取到 length-1

数组是引用数据类型,在打印一个引用数据类型时，默认会打印 类型@哈希值

数组的遍历: 将数组里的数据都访问一遍
*/
public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] nums = {4, 9, 2, 1, 6, 5, 7, 3, 8, 7, 5};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        String[] names = {"jack", "tony"};
        System.out.println(names);  // [Ljava.lang.String;@4554617c
    }
}
