package com.xiaowei.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @athour Marie
 * @date 2018/11/13 5:25 PM
 **/
public class NonOwenInvocationHandler implements InvocationHandler {
    PersonBean personBean;



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if (method.getName().equals("setHotOrNot")){
                return method.invoke(personBean,args);

            }else if (method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
