package com.xiaowei.stragegy.test;

import com.xiaowei.stragegy.behacvior.vo.FlyNoWay;
import com.xiaowei.stragegy.behacvior.vo.Quck;
import com.xiaowei.stragegy.behacvior.vo.SQuck;
import com.xiaowei.stragegy.pojo.Duck;
import com.xiaowei.stragegy.pojo.Mall;

/**
 * @athour Marie
 * @date 2018/11/3 11:52 AM
 **/
public class MiniDuck {
    public static void main(String[] args) {
        Duck mall = new Mall();
        mall.performFly();
        mall.performQuck();
        Duck model = new Mall();
        model.performQuck();
        model.performFly();
        model.setFlybeahavior(new FlyNoWay());
        model.setQuckBehavior(new SQuck());
        model.performFly();;
        model.performQuck();
    }

}
