package com.xiaowei.singleton;

/**
 * @athour Marie
 * @date 2018/11/8 5:06 PM
 **/
public class Singleton {
    private static Singleton instance;
    // 同步， 线程安全，但是效率不高

    public Singleton() {
    }
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
