package com.designpatterns.decorator.coffee;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;

    String description = "Unknown";

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public double addSizePrice(double coffeePrice){
        double cost = 0;
        if (this.getSize() == Size.TALL) {
            cost += coffeePrice;
        } else if (this.getSize() == Size.GRANDE) {
            cost += coffeePrice * 1.25;
        } else if (this.getSize() == Size.VENTI) {
            cost += coffeePrice * 1.5;
        }
        return cost;
    }
}
