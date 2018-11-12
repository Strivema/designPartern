package com.xiaowei.command.ordinary;

import com.xiaowei.command.smiple.Command;

import java.util.Arrays;

/**
 * @athour Marie
 * @date 2018/11/9 2:25 PM
 **/
public class RemoteContrl {
    Command [] onCommands;
    Command [] offCommands;

    public RemoteContrl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command com = new NoCommand();
        for (int i=0;i<offCommands.length;i++){
            onCommands[i] = com;
            offCommands[i] = com;
        }
    }
    public void setCommand(int slot,Command on,Command off){
        onCommands[slot] = on;
        offCommands[slot] = off;
    }
    public void onPushed(int slot){
        onCommands[slot].excute();
    }
    public void offPushed(int slot){
        offCommands[slot].excute();
    }

    @Override
    public String toString() {
        return "RemoteContrl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
