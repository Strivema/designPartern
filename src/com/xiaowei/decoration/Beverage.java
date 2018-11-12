package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:33 PM
 **/
public abstract class Beverage {
    String description = "Unkown Beverage";
    int size;
    double TILL;
    double GRANDE;
    double VENTI;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
