package com.designpatterns.command.remote.array;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }
    public void high() {
        speed = HIGH;
// code to set fan to high
    }
    public void medium() {
        speed = MEDIUM;
// code to set fan to medium
    }
    public void low() {
        speed = LOW;
// code to set fan to low
    }
    public void off() {
        speed = OFF;
// code to turn fan off
    }
    public int getSpeed() {
        return speed;
    }
}
