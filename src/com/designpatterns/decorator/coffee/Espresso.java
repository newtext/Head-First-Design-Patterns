package com.designpatterns.decorator.coffee;

public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return addSizePrice(1.99);
    }
}
