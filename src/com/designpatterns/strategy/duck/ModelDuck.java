package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyNoWay;
import com.designpatterns.strategy.behaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
