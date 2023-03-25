package com.atguigu.enumeration;

public class Month {
    public static final Month JAN = new Month();
    public static final Month FEB = new Month();
    public static final Month MAR = new Month();
    public static final Month APR = new Month();
    public static final Month MAY = new Month("五月");
    public static final Month JUN = new Month();
    public static final Month JUL = new Month();
    public static final Month AUG = new Month();
    public static final Month SEP = new Month();
    public static final Month OCT = new Month();
    public static final Month NOV = new Month("十一月");
    public static final Month DEC = new Month();

    private String monthName;

    private Month() {
    }

    private Month(String monthName) {
        this.monthName = monthName;
    }

    @Override
    public String toString() {
        if (monthName != null) return monthName;
        return super.toString();
    }
}
