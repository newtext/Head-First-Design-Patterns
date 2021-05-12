package com.designpatterns.factory.IngredientFactory.store;

import com.designpatterns.factory.IngredientFactory.cheese.Cheese;
import com.designpatterns.factory.IngredientFactory.cheese.ReggianoCheese;
import com.designpatterns.factory.IngredientFactory.clams.Clams;
import com.designpatterns.factory.IngredientFactory.clams.FreshClams;
import com.designpatterns.factory.IngredientFactory.dough.Dough;
import com.designpatterns.factory.IngredientFactory.dough.ThinCrustDough;
import com.designpatterns.factory.IngredientFactory.sauce.MarinaraSauce;
import com.designpatterns.factory.IngredientFactory.sauce.Sauce;
import com.designpatterns.factory.IngredientFactory.vegetables.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
