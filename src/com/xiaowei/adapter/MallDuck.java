package com.xiaowei.adapter;

/**
 * @athour Marie
 * @date 2018/11/9 3:50 PM
 **/
public class MallDuck implements Duck {

    @Override
    public void quck() {
        System.out.println("Quck");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
