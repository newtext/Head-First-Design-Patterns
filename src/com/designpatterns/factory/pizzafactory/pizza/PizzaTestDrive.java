package com.designpatterns.factory.pizzafactory.pizza;

import com.designpatterns.factory.pizzafactory.chicago.ChicagoPizzaStore;
import com.designpatterns.factory.pizzafactory.ny.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }

}
