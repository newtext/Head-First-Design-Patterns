package com.designpatterns.strategy.behaviors;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Im flying");
    }
}
