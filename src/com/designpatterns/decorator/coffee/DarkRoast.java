package com.designpatterns.decorator.coffee;

public class DarkRoast extends Beverage {

    public  DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return addSizePrice(.99);
    }
}
