package com.atguigu.leetcode;

/**
 * @Description: 有效的括号
 * @Author: Gavin
 * @Date: 3/23/2023 5:19 PM
 */
public class kuohao {
    public static void main(String[] args) {
        // String s = ")}";
        // String s = "()[]{}";
        // String s = "(){}}{";
        String s = "({[]})";
        System.out.println(isValid(s));

    }


    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        boolean x = true;
        if (arr.length % 2 != 0) {
            return false;
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(') {
                    if (arr[arr.length - 1 - i] != ')') {
                        return false;
                    }
                } else if (arr[i] == '{') {

                    if (arr[arr.length - 1 - i] != '}') {
                        return false;
                    }
                } else if (arr[i] == '[') {
                    if (arr[arr.length - 1 - i] != ']') {
                        return false;
                    }
                }
            }
            if(sss(arr)){
                return true;
            }

        }

        return false;
    }

    //非对称
    public static boolean sss(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '(') {
                if (arr[i + 1] != ')') {

                    if (arr[arr.length - i - 1] != ')') {
                        return false;
                    }

                }


            } else if (arr[i] == '{') {

                if (arr[i + 1] != '}') {
                    if (arr[arr.length - i - 1] != '}') {
                        return false;
                    }
                }

            } else if (arr[i] == '[') {
                if (arr[i + 1] != ']') {
                    if (arr[arr.length - i - 1] != '}') {
                        return false;
                    }
                }
            } else if (arr[0] == ']' || arr[0] == '}' || arr[0] == ')') {
                return false;
            } else {
                return false;
            }
        }
        return true;

    }
}

