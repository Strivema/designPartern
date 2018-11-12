package com.xiaowei.factory.simpele;

/**
 * @athour Marie
 * @date 2018/11/7 8:22 PM
 **/
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza  = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);

}
