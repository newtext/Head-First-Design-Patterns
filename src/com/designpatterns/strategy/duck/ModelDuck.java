package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyNoWay;
import com.designpatterns.strategy.behaviors.MuteQuack;

public class ModelDuck extends Duck{

    public ModelDuck() {
//        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
