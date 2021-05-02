package com.designpatterns.decorator.coffee;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + addSizePrice(.10);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

}
