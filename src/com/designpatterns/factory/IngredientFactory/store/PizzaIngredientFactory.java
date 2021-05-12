package com.designpatterns.factory.IngredientFactory.store;

import com.designpatterns.factory.IngredientFactory.cheese.Cheese;
import com.designpatterns.factory.IngredientFactory.clams.Clams;
import com.designpatterns.factory.IngredientFactory.dough.Dough;
import com.designpatterns.factory.IngredientFactory.sauce.Sauce;
import com.designpatterns.factory.IngredientFactory.vegetables.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}
