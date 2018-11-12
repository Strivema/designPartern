package com.xiaowei.stragegy.behacvior.vo;

import com.xiaowei.stragegy.behacvior.Flybeahavior;

/**
 * @athour Marie
 * @date 2018/11/3 11:34 AM
 **/
public class FlyNoWay implements Flybeahavior {

    @Override
    public void fly() {
        System.out.println("no fly");
    }
}
