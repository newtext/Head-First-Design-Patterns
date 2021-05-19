package com.designpatterns.command.remote.array;

public class Light {

    String location;
    public Light(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Lights On");
    }
    public void off(){
        System.out.println(location + " Lights Off");
    }
}
