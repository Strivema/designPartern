package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Light;

/**
 * @athour Marie
 * @date 2018/11/9 2:43 PM
 **/
public class RemoteLoader {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteContrl remoteContrl  =new RemoteContrl();
        remoteContrl.setCommand(1,lightOnCommand,lightOffCommand);
        remoteContrl.onPushed(1);
        remoteContrl.offPushed(1);
    }

}
