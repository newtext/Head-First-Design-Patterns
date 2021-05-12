package com.designpatterns.factory.IngredientFactory;

import com.designpatterns.factory.IngredientFactory.cheese.Cheese;
import com.designpatterns.factory.IngredientFactory.clams.Clams;
import com.designpatterns.factory.IngredientFactory.dough.Dough;
import com.designpatterns.factory.IngredientFactory.sauce.Sauce;
import com.designpatterns.factory.IngredientFactory.vegetables.Veggies;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Clams clam;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setVeggies(Veggies[] veggies) {
        this.veggies = veggies;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setClam(Clams clam) {
        this.clam = clam;
    }

    public abstract void prepare();
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", clam=" + clam +
                '}';
    }
}
