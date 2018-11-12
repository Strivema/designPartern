package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 1:04 PM
 **/
public abstract class Caffeine {
    void prepare(){
       boilWater();
       brew();
       addCondit();
       pourInCup();
    }
    abstract void brew();
    abstract void addCondit();
    void boilWater(){
        System.out.println("boil water");
    }
    void pourInCup(){
        System.out.println("pouring in cup");

    }
}
