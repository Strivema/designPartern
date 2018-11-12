package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Command;
import com.xiaowei.command.smiple.Light;

/**
 * @athour Marie
 * @date 2018/11/9 2:34 PM
 **/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.off();

    }
}
