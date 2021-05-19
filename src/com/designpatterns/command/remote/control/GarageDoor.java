package com.designpatterns.command.remote.control;

public class GarageDoor {
    public void up() {
        System.out.println("Garage Door is Open");
    }
    public void down() {
        System.out.println("Garage Door is Closed");
    }
    public void stop() {
        System.out.println("Garage Door is stop");
    }
    public void lightOn() {
        System.out.println("Garage Door Light on");
    }
    public void lightOff() {
        System.out.println("Garage Door Light off");
    }
}
