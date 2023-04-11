package com.atguigu.exercise;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/8/2023 11:53 AM
 */
@Table("user__")
public class User {
    private int id;
    private String username;
    @Column(columnName = "passwd")
    private String password;
    private String gender;
    private double banlance;
}
