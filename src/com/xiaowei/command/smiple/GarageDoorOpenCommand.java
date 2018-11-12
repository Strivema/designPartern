package com.xiaowei.command.smiple;

/**
 * @athour Marie
 * @date 2018/11/8 8:43 PM
 **/
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void excute() {
        garageDoor.up();

    }
}
