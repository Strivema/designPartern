package com.xiaowei.stragegy.pojo;

import com.xiaowei.stragegy.behacvior.vo.FlyWithWngs;
import com.xiaowei.stragegy.behacvior.vo.Quck;

/**
 * @athour Marie
 * @date 2018/11/3 11:41 AM
 **/
public class Mall extends Duck{
    public Mall() {
        quckBehavior = new Quck();
        flybeahavior = new FlyWithWngs();
    }
    public void display(){
        System.out.println("hello");
    }

}
