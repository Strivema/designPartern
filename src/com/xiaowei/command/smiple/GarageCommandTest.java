package com.xiaowei.command.smiple;

/**
 * @athour Marie
 * @date 2018/11/8 8:46 PM
 **/
public class GarageCommandTest {
    public static void main(String[] args) {
        SimpleRemoteContrl simpleRemoteContrl = new SimpleRemoteContrl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteContrl.setCommand(lightOnCommand);
        simpleRemoteContrl.buttonWasPressed();
        simpleRemoteContrl.setCommand(garageDoorOpenCommand);
        simpleRemoteContrl.buttonWasPressed();


    }
}
