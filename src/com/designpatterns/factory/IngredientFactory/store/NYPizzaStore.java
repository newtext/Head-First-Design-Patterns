package com.designpatterns.factory.IngredientFactory.store;

import com.designpatterns.factory.IngredientFactory.Pizza;
import com.designpatterns.factory.IngredientFactory.pizza.CheesePizza;
import com.designpatterns.factory.IngredientFactory.pizza.ClamPizza;
import com.designpatterns.factory.IngredientFactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
