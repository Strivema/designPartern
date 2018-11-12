package com.xiaowei.template;

/**
 * @athour Marie
 * @date 2018/11/10 1:08 PM
 **/
public class MyCoffe extends Caffeine {

    @Override
    void brew() {
        System.out.println(" coffe brew ");
    }

    @Override
    void addCondit() {
        System.out.println("add lemmon");
    }

    public static void main(String[] args) {
        new MyCoffe().prepare();
    }
}
