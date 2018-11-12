package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 3:47 PM
 **/
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
