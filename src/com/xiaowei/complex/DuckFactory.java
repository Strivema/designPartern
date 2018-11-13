package com.xiaowei.complex;

/**
 * @athour Marie
 * @date 2018/11/13 7:21 PM
 **/
public class DuckFactory extends AbstractDuck {

    @Override
    public Quarkable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quarkable createRedHeadDuck() {
        return new RedHeadDuck();
    }
}
