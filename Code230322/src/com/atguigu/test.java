package com.atguigu;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/22/2023 9:17 PM
 */
public class test {
}
class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr = new String[n];
        for(int i = 0,j = i + 1; i < n;i++){
            if(i % 3 == 0 && i % 5 == 0) {arr[i] = "FizzBuzz";}
            else if (i % 3 == 0) {arr[i] = "Fizz";}
            else if (i % 5 == 0) {arr[i] = "Buzz";}
            else {arr[i] = "" + i;}

        }
        return Arrays.asList(arr);
    }
}