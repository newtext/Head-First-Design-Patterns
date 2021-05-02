package com.designpatterns.decorator.coffee;

public class RunCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage2TALL = new DarkRoast();
        beverage2TALL = new Mocha(beverage2TALL);
        beverage2TALL = new Mocha(beverage2TALL);
        beverage2TALL = new Whip(beverage2TALL);
        System.out.println(beverage2TALL.getDescription() + " $" + beverage2TALL.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
