/*
容器: 可以用来存储多个数据的一个结构，容器里的数据我们称之为元素。
Java里的容器有两大类型: 数组和集合

数组是一个存储相同类型并且长度固定的容器

特点:
    1. 可以用来存储多个元素
    2. 存储的元素是 兼容 的类型
    3. 长度是固定的，不允许修改
*/
public class ArrayDemo1 {
    public static void main(String[] args) {
        // 数组的定义
        int[] nums1;
        int nums2[];  // 不推荐

        // 数组的静态初始化: 数组创建时就指定内容
        int[] scores = new int[]{89, 45, 76, 58, 90, 88, 57};
        String[] names = {"jack", "tony", "jerry"};

        int[] arr; // 声明数组但是没有初始化
        // arr = {4, 5, 6};  // 声明和赋值分开，不能使用 {}直接赋值
        arr = new int[]{4, 5, 6};  // 声明和赋值分开，可以使用 new int[]{}赋值


        // 数组的动态初始化: 数组创建时只指定长度，不指定内容，通过下标来指定元素
        int[] ages = new int[5];  // 创建了一个int类型的数组，长度为5

        // 数组的下标从 0 开始!
        ages[0] = 21;
        ages[1] = 18;
        ages[2] = 19;
        ages[3] = 17;
        ages[4] = 20;
        // ages[5] = 21;
        // int[] age = {21, 18, 19, 17, 20};

        // 数组的长度是固定的，要么指定长度，要么指定内容。不能既指定长度，又指定内容!
        // int[] arr2 = new int[4]{8,9,6,5};


    }
}
