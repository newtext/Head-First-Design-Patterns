package com.designpatterns.decorator.coffee;

public abstract class CondimentDecorator extends Beverage {
    /*
    Beverage supertype to refer to the Beverage so the Decorator can wrap any beverage.
     */
    Beverage beverage; //To keep reference of the other beverages
    public abstract String getDescription();
}
