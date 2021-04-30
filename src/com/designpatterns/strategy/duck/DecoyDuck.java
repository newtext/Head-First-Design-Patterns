package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyNoWay;
import com.designpatterns.strategy.behaviors.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
}
