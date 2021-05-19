package com.designpatterns.command.remote.array;

public class GarageDoor {
    String name;

    public GarageDoor(String name){
        this.name = name;
    }

    public void up() {
        System.out.println(name + " is Open");
    }
    public void down() {
        System.out.println(name + " is Closed");
    }
    public void stop() {
        System.out.println(name + " is stop");
    }
    public void lightOn() {
        System.out.println(name + " Light on");
    }
    public void lightOff() {
        System.out.println(name + " Light off");
    }
}
