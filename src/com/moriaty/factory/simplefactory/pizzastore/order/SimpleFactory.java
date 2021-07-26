package com.moriaty.factory.simplefactory.pizzastore.order;

import com.moriaty.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.moriaty.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.moriaty.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    public Pizza createPizza(String type) {
        System.out.println("simple factory: " + type);
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        }
        return pizza;
    }

    public static Pizza createPizza2(String type) {
        System.out.println("simple factory2: " + type);
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        }
        return pizza;
    }
}
