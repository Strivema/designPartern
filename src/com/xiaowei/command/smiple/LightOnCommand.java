package com.xiaowei.command.smiple;

/**
 * @athour Marie
 * @date 2018/11/8 8:29 PM
 **/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
