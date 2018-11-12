package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 12:23 PM
 **/
public class Tea {
    public void biloWater(){
        System.out.println("Boiling water");
    }
    public void stepTea(){
        System.out.println("Steping the tea");
    }
    public void addLemmon(){
        System.out.println("Adding temp");
    }
    public void pourIntoCup(){
        System.out.println("pouring into cup");
    }
    public void prepare(){
        biloWater();
        stepTea();
        addLemmon();
        pourIntoCup();

    }

    public static void main(String[] args) {
        new Tea().prepare();
    }

}
