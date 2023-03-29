package com.atguigu.regex;

/*
正则使用场景: 前端校验用户输入的数据是否合法; 爬虫
正则表达式标点符号的特殊含义:
    .     除了换行以外的其他任意字符
    ?     前面的内容最多出现一次
    *     前面的内容出现任意次数
    +     前面的内容至少出现一次
    {n}   前面的内容只能出现n次
    {n,m} 前面的内容出现[n,m]次
    {n,}  前面的内容至少出现n次
    []    单个字符的可选值
    -     用在[]里表示区间范围
    ^     用在[]里表示取反; 表示以指定的内容开始
    ()    用来分组
    |     通常配合()使用，用来表示多个字符的可选项
    $     以指定的内容结束
*/
public class RegexDemo2 {
    public static void main(String[] args) {
        String s1 = "hello \nworld";
        System.out.println(s1.replaceAll(".", "x"));

        System.out.println("good".matches("go?d"));
        System.out.println("gooooooooooooooood".matches("go*d"));
        System.out.println("gd".matches("go+d"));
        System.out.println("god".matches("go{2}d"));
        System.out.println("goooooood".matches("go{2,6}d"));
        System.out.println("goood".matches("go{2,}d"));
        System.out.println("goood".matches("go{0,5}d"));

        String regex1 = "g[amtp]d";
        System.out.println("gad".matches(regex1));  // true
        System.out.println("gmd".matches(regex1));  // true
        System.out.println("gtd".matches(regex1));  // true
        System.out.println("gpd".matches(regex1));  // true
        System.out.println("gmpd".matches(regex1));  // false

        String regex2 = "g[c-f]d";
        System.out.println("gcd".matches(regex2));  // true
        System.out.println("ged".matches(regex2));  // true
        System.out.println("gtd".matches(regex2));  // false

        String regex3 = "g[^2-5]d";
        System.out.println("g3d".matches(regex3));  // false
        System.out.println("gxd".matches(regex3));  // true

        String regex4 = "g((mp)|(sf)|(pp)|(sp))d";  // gmpd  gsfd  gppd  gspd
        System.out.println("gmpd".matches(regex4));
        System.out.println("gsfd".matches(regex4));
        System.out.println("gppd".matches(regex4));
        System.out.println("gspd".matches(regex4));
        System.out.println("gmmppssfffffd".matches(regex4));

        System.out.println("hellogoodyes".matches("^go{2}d$"));
    }
}
