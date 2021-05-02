package com.designpatterns.decorator.coffee;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public double cost() {
        System.out.println(getSize());
        return beverage.cost() + addSizePrice(.10);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
