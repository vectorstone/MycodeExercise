package com.atguigu.homework2;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 3/29/2023 9:01 PM
 */
public class Coordinate <T>{
    private T x;
    private T y;

    public Coordinate() {
    }

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "东经" + x +
                ", 北纬" + y +
                '}';
    }
}
