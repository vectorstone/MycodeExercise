package com.atguigu.regex;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个段内容:");
        String content = scanner.next();
        scanner.close();

        // 1. 判断用户输入的内容是否是合法的身份证
        //                   420600        2010                  02                 31                 3126
        /*String idRegex = "[1-9]\\d{5}((19)|(20))\\d{2}((0[1-9])|(1[0-2]))((0[1-9])|([12]\\d)|(3[01]))\\d{3}[0-9Xx]";
        System.out.println(content.matches(idRegex));*/


        // 2. 判断用户输入的内容是否是合法的IP地址   ip地址是点分十进制  192.45.90.4  每个数字的取值范围是[0,255]
        //                  0-9    10-99    100-199     200-249    250-255
        String ipRegex = "(((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";
        System.out.println(content.matches(ipRegex));


        /*boolean valid = true;
        String[] ips = content.split("\\.");  // ["192","450","90","4"]
        if (ips.length != 4) valid = false;
        if (valid) {
            for (int i = 0; i < ips.length; i++) {
                int ip = Integer.parseInt(ips[i]);
                if (!(ip >= 0 && ip <= 255)) {
                    valid = false;
                    break;
                }
            }
        }
        System.out.println(valid);*/
    }
}
