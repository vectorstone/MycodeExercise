import java.util.Arrays;

/*
生成大乐透彩票  前区 [1,35] 选5,  后区[1,12]选2
而且数据要求不重复
 */
public class Homework4 {
    public static void main(String[] args) {
        int[] nums = new int[7];

        /*for (int i = 0; i < 5; i++) {
            int front = (int) (Math.random() * 35 + 1);
            int index = -1;
            for (int j = 0; j < 5; j++) {
                if (nums[j] == front) {
                    index = j;
                    break;
                }
            }
            if (index == -1) {
                nums[i] = front;
            } else {
                i--;
            }
        }*/


        /*for (int i = 0; i < 5; i++) {
            int front = (int) (Math.random() * 35 + 1);
            int index = -1;
            for (int j = 0; j < 5; j++) {
                if (nums[j] == front) {
                    index = j;
                    break;
                }
            }
            if (index != -1) {
                i--;
                continue;
            }
            nums[i] = front;
        }*/


        for (int i = 0; i < 5; ) {
            int front = (int) (Math.random() * 35 + 1);
            int index = -1;
            for (int j = 0; j < 5; j++) {
                if (nums[j] == front) {
                    index = j;
                    break;
                }
            }
            if (index == -1) {
                nums[i] = front;
                i++;
            }
        }

        for (int i = 5; i < 7; ) {
            int front = (int) (Math.random() * 12 + 1);
            int index = -1;
            for (int j = 5; j < 7; j++) {
                if (nums[j] == front) {
                    index = j;
                    break;
                }
            }
            if (index < 0) {
                nums[i] = front;
                i++;
            }
        }


        System.out.println(Arrays.toString(nums));
    }
}
