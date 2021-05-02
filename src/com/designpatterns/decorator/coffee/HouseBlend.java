package com.designpatterns.decorator.coffee;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return addSizePrice(.89);
    }
}
