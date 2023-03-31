package com.atguigu.bean;

public class Phone implements Comparable<Phone> {
    private String brand;
    private double price;
    private double weight;

    public Phone() {
    }

    public Phone(String brand, double price, double weight) {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Phone o) {
        // return (int) (price - o.price);
        return Double.compare(weight, o.weight);
    }
}
