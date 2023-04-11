package com.atguigu.exercise;
import java.util.Date;
/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/8/2023 11:53 AM
 */
@Table(value = "_movie")
public class Movie {
    @Column(columnName = "i_d")
    private int id;
    private String director;
    private int timeMinutes;
    private Date showTime;
}
