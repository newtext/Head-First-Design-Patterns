package com.designpatterns.factory.pizzafactory.ny;

import com.designpatterns.factory.pizzafactory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza") ;
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        addToppings("Grated");
        addToppings("Reggiano");
        addToppings("Cheese");
    }
}
