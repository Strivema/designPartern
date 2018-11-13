package com.xiaowei.complex;

/**
 * @athour Marie
 * @date 2018/11/13 7:22 PM
 **/
public class CountingFactory extends AbstractDuck {

    @Override
    public Quarkable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quarkable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }
}
