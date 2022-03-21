package com.moriaty.factory.factorymethod.pizzastore.order;

import com.moriaty.factory.factorymethod.pizzastore.pizza.*;

/**
 * <p>
 * LDOrderPizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:27
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
