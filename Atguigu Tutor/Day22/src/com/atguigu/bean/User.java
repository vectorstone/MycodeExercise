package com.atguigu.bean;

import com.atguigu.db.Column;

public class User {
    @Column(columnName = "user_id")
    private int id;
    private String username;
    private String password;
    private String gender;
    private double balance;
}
