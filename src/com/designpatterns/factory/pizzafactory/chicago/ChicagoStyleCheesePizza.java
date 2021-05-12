package com.designpatterns.factory.pizzafactory.chicago;

import com.designpatterns.factory.pizzafactory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        addToppings("Shredded");
        addToppings("Mozzarella");
        addToppings("Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
