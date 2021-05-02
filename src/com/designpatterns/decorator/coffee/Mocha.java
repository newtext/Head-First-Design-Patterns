package com.designpatterns.decorator.coffee;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + addSizePrice(.20);
    }
}
