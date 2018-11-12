package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:37 PM
 **/
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
