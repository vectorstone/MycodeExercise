package com.atguigu.bean;

public class Computer implements Cloneable, Comparable<Computer> {
    private String brand;
    private double price;

    private double weight;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Computer(String brand, double price, double weight) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Computer clone() throws CloneNotSupportedException {
        return (Computer) (super.clone());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        if (weight > o.weight) return 1;
        else if (weight < o.weight) return -1;
        return 0;
    }
}
