package com.designpatterns.command.remote.control;

import com.designpatterns.command.remote.control.Command;

public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
