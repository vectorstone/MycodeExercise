import java.util.Arrays;

/*
一维数组: 数组里存储的是数据  int[]存储的是int类型的元素
二维数组: 数组里存储的是数组
    int[][] arr: arr里存储的是int[]数组  可以用来表示一个表格
    int[][][] arr:  图像处理,三维数组可以用来表示一张图片
*/
public class NDArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        // int arr2[][];
        // int[] arr2[];

        // 静态初始化
        int[][] arr2 = /*new int[][]*/ {
                {2, 3, 4},
                {6, 9, 2, 4, 7},
                {6},
                {8, 2},
        };

        // 动态初始化:只指定长度，不指定内容
        int[][] arr3 = new int[4][2];
        /*{
            {9,0},
            {2,6,7,9,4},
            {3,8},
            {0,7}
        }*/
        arr3[0][0] = 9;
        arr3[3][1] = 7;
        arr3[1] = new int[]{2, 6, 7, 9, 4};
        arr3[2][0] = 3;
        arr3[2][1] = 8;
        // arr3[2][2] = 9;

        int[][] arr4 = new int[3][];
        /*
        {
            {1,3,5},
        null,
        null
        }
         */
        arr4[0] = new int[]{1, 3, 5};

        // int[][] arr5 = new int[][4];


        int[][][] pic = {
                {
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                },
                {
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                },
                {
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                        {100, 200, 128},
                },
        };

        System.out.println(Arrays.deepToString(pic));
    }
}
