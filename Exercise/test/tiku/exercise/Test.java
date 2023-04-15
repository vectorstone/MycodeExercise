package tiku.exercise;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 7:54 PM
 */
public class Test {
    @org.junit.Test
    public void test(){
        int[] nums = {34, 28, 56, 73, 88, 65, 44, 57};

        System.arraycopy(nums, 4, nums, 3, 4);
        System.out.println(Arrays.toString(nums));//[34, 28, 56, 88, 65, 44, 0, 0]
    }

}
