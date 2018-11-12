package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:45 PM
 **/
public class Decat extends Beverage {

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
