package com.designpatterns.factory.IngredientFactory.pizza;

import com.designpatterns.factory.IngredientFactory.Pizza;
import com.designpatterns.factory.IngredientFactory.store.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setVeggies(ingredientFactory.createVeggies());
        setClam(ingredientFactory.createClam());
    }
}
