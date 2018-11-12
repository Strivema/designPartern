package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Command;
import com.xiaowei.command.smiple.Light;

/**
 * @athour Marie
 * @date 2018/11/9 2:35 PM
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
