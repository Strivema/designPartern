package com.xiaowei.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @athour Marie
 * @date 2018/11/13 3:21 PM
 **/
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl()throws RemoteException{

    }
    @Override
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.bind("RemoteHello",service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
