package com.moriaty.factory.absfactory.pizzastore.order;

import com.moriaty.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.moriaty.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.moriaty.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new BJCheesePizza();
                break;
            case "pepper":
                pizza = new BJPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
