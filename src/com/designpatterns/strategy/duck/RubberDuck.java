package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyNoWay;
import com.designpatterns.strategy.behaviors.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
