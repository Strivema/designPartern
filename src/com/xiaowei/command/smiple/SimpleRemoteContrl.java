package com.xiaowei.command.smiple;

/**
 * @athour Marie
 * @date 2018/11/8 8:30 PM
 **/
public class SimpleRemoteContrl {
    Command slot;

    public SimpleRemoteContrl() {

    }
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.excute();
    }
}
