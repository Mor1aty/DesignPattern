package com.moriaty.factory.absfactory.pizzastore.order;

import com.moriaty.factory.absfactory.pizzastore.pizza.*;

/**
 * <p>
 * LDFactory
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 18:07
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "cheese":
                pizza = new LDCheesePizza();
                break;
            case "pepper":
                pizza = new LDPepperPizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
