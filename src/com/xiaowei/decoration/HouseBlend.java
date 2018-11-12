package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:39 PM
 **/
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
