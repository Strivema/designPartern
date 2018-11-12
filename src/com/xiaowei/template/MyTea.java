package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 1:07 PM
 **/
public class MyTea extends Caffeine {

    @Override
    void brew() {
        System.out.println("tea ");
    }

    @Override
    void addCondit() {
        System.out.println("add tea");
    }

    public static void main(String[] args) {
        new MyTea().prepare();
    }
}
