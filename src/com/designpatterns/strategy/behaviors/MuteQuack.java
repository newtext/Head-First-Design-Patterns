package com.designpatterns.strategy.behaviors;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
