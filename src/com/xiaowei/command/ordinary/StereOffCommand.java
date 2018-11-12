package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Command;

/**
 * @athour Marie
 * @date 2018/11/9 2:39 PM
 **/
public class StereOffCommand implements Command {
    Stere stere;

    public StereOffCommand(Stere stere) {
        this.stere = stere;
    }

    @Override
    public void excute() {
        stere.off();

    }
}
