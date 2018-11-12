package com.xiaowei.adapter;

import java.util.Iterator;

/**
 * @athour Marie
 * @date 2018/11/9 3:57 PM
 **/
public class DuckTest {
    public static void main(String[] args) {
        MallDuck mallDuck = new MallDuck();
        WildTurky wildTurky = new WildTurky();
        Duck adapter = new TurkyAdapter(wildTurky);
        System.out.println("turky--------");
        wildTurky.fly();
        wildTurky.gobble();
        System.out.println("duck---------");
        mallDuck.fly();
        mallDuck.quck();
        System.out.println("adapter--------");
        adapter.fly();
        adapter.quck();

    }

}
