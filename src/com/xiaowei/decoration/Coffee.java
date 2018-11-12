package com.xiaowei.decoration;

/**
 * @athour Marie
 * @date 2018/11/7 4:01 PM
 **/
public class Coffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description+"  "+beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription()+" "+beverage1.cost());

    }
}
