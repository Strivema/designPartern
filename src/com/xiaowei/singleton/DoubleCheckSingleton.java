package com.xiaowei.singleton;

/**
 * @athour Marie
 * @date 2018/11/8 6:07 PM
 **/
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;
    private DoubleCheckSingleton(){

    }
    public static DoubleCheckSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckSingleton.class){
                if(instance ==null){
                    instance =  new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
