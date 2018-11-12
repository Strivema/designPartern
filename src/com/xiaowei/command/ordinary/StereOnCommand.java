package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Command;

/**
 * @athour Marie
 * @date 2018/11/9 2:36 PM
 **/
public class StereOnCommand implements Command {

    Stere stere;

    public StereOnCommand(Stere stere) {
        this.stere = stere;
    }

    @Override
    public void excute() {
        stere.on();

    }
}
