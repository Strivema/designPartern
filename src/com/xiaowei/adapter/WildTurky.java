package com.xiaowei.adapter;

/**
 * @athour Marie
 * @date 2018/11/9 3:52 PM
 **/
public class WildTurky implements Turky {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("i am not fly");
    }
}
