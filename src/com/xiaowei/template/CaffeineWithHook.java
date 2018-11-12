package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 1:25 PM
 **/
public abstract class CaffeineWithHook {
    void prepare(){
        boilWater();
        brew();
        if(customHook()){
            addCondint();
        }


        pourinCup();
    }
    abstract void brew();
    abstract void addCondint();
    void boilWater(){
        System.out.println("boil water");
    }
    void pourinCup(){
        System.out.println("pour in cup");
    }
    boolean customHook(){
        return true;
    }

}
