package com.xiaowei.stragegy.pojo;

import com.xiaowei.stragegy.behacvior.Flybeahavior;
import com.xiaowei.stragegy.behacvior.QuckBehavior;

/**
 * @athour Marie
 * @date 2018/11/3 11:38 AM
 **/
public abstract class Duck {
    Flybeahavior flybeahavior;
    QuckBehavior quckBehavior;

    public void performQuck(){
        quckBehavior.quck();
    }
    public void performFly(){
        flybeahavior.fly();
    }
    public abstract void display();

    public void swim(){
        System.out.println("ok");
    }

    public Flybeahavior getFlybeahavior() {
        return flybeahavior;
    }

    public void setFlybeahavior(Flybeahavior flybeahavior) {
        this.flybeahavior = flybeahavior;
    }

    public QuckBehavior getQuckBehavior() {
        return quckBehavior;
    }

    public void setQuckBehavior(QuckBehavior quckBehavior) {
        this.quckBehavior = quckBehavior;
    }
}
