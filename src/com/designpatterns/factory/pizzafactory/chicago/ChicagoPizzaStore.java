package com.designpatterns.factory.pizzafactory.chicago;

import com.designpatterns.factory.pizzafactory.pizza.Pizza;
import com.designpatterns.factory.pizzafactory.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else return null;
    }
}
