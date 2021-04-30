package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyWithWings;
import com.designpatterns.strategy.behaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
