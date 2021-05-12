package com.designpatterns.factory.IngredientFactory.pizza;

import com.designpatterns.factory.IngredientFactory.Pizza;
import com.designpatterns.factory.IngredientFactory.store.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setVeggies(ingredientFactory.createVeggies());
        setClam(ingredientFactory.createClam());
    }
}
