package com.xiaowei.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @athour Marie
 * @date 2018/11/13 5:18 PM
 **/
public class OwenInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwenInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if (method.getName().equals("setHotOrNot")){
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
