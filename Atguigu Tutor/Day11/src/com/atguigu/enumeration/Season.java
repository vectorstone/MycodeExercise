package com.atguigu.enumeration;

public enum Season/*extends Month*/ {
    // public static final Season SPRING = new Season();
    SPRING, SUMMER(), AUTUMN("秋天"), WINTER("冬天");
    private String seasonName;

    Season() {
    }

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public void demo() {
        System.out.println("我是枚举里的demo方法");
    }

    @Override
    public String toString() {
        if (seasonName != null) return seasonName;
        return super.toString();
    }
}
