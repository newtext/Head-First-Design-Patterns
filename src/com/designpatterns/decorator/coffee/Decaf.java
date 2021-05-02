package com.designpatterns.decorator.coffee;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }
    public double cost() {
        return addSizePrice(1.05);
    }
}
