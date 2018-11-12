package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:41 PM
 **/
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
