package com.moriaty.factory.factorymethod.pizzastore.order;

import com.moriaty.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.moriaty.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.moriaty.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * <p>
 * BJOrderPizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:25
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
