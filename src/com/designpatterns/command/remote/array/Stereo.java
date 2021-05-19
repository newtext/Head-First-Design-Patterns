package com.designpatterns.command.remote.array;

public class Stereo {

    String location;
    public Stereo(String location){
        this.location = location;
    }
    public void on() {
        System.out.println(location + " Stereo On");
    }
    public void off() {
        System.out.println(location + " Stereo off");
    }
    public void setCD() {
        System.out.println(location + " Stereo set Cd");
    }
    public void setDVD() {
        System.out.println(location + " Stereo set Dvd");
    }
    public void setRadio() {
        System.out.println(location + " Stereo Set Radio");
    }
    public void setVolume(int volume) {
        System.out.println(location + " Stereo set volume" + volume);
    }

}
