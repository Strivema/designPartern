package com.xiaowei.complex;

/**
 * @athour Marie
 * @date 2018/11/13 7:08 PM
 **/
public class QuackCounter implements Quarkable {

    Quarkable duck;
    static int num;

    public QuackCounter(Quarkable duck) {
        this.duck = duck;
    }


    @Override
    public void quark() {
        duck.quark();
        num++;
    }
    public static int getNum(){
        return num;
    }
}
