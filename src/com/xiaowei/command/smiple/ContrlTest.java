package com.xiaowei.command.smiple;

/**
 * @athour Marie
 * @date 2018/11/8 8:32 PM
 **/
public class ContrlTest {
    public static void main(String[] args) {
        SimpleRemoteContrl remote = new SimpleRemoteContrl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
