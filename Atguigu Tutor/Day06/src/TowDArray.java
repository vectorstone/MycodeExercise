/*
二维数组的数据存储:
 */
public class TowDArray {
    public static void main(String[] args) {
        int[][] nums1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] nums2 = {
                {1, 7, 3},
                {4, 5, 6}
        };
        System.out.println(nums1 == nums2);  // false

        boolean equals = true;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                if (nums1[i][j] != nums2[i][j]) {
                    equals = false;
                    break;
                }
            }
        }
        System.out.println(equals);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        int[][] nums3 = {arr1, arr2};
        int[][] nums4 = {arr1, arr2};
        System.out.println(nums3 == nums4);

        System.out.println(nums1[0] == nums2[0]);  // false
        System.out.println(nums3[0] == nums4[0]);  // true

        /*int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        boolean equals = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                equals = false;
                break;
            }
        }
        System.out.println(equals);*/
    }
}
