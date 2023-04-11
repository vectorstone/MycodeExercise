package com.atguigu.bean;

import com.atguigu.db.Column;
import com.atguigu.db.Table;

import java.util.Date;

@Table(value = "t_movie")
public class Movie {
    @Column(columnName = "m_id")
    private int id;
    private String director;
    private String actor;
    @Column(columnName = "time_minutes")
    private int timeMinutes;
    @Column(columnName = "show_time")
    private Date showTime;
}
