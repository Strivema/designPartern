package com.xiaowei.singleton;

/**
 * @athour Marie
 * @date 2018/11/8 6:05 PM
 **/
public class OrdinarySingleton {
    private static Singleton instance;

    private OrdinarySingleton() {
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return instance;
    }
}
