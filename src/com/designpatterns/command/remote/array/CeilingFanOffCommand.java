package com.designpatterns.command.remote.array;

public class CeilingFanOffCommand implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {

    }
}
