package com.designpatterns.strategy.duck;

import com.designpatterns.strategy.behaviors.FlyRocketPowered;
import com.designpatterns.strategy.behaviors.MuteQuack;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        model.setQuackBehavior(new MuteQuack());
        model.performQuack();

    }
}
