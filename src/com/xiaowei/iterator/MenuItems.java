package com.xiaowei.iterator;

/**
 * @athour Marie
 * @date 2018/11/12 4:03 PM
 **/
public class MenuItems {
    String name;
    String desc;
    boolean vage;
    double price;

    public MenuItems(String name, String desc, boolean vage, double price) {
        this.name = name;
        this.desc = desc;
        this.vage = vage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isVage() {
        return vage;
    }

    public void setVage(boolean vage) {
        this.vage = vage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
