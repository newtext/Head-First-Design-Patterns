package com.designpatterns.decorator.coffee;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public double cost() {
        return beverage.cost() + addSizePrice(.15);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
