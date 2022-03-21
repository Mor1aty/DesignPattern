package com.moriaty.factory.absfactory.pizzastore.order;

import com.moriaty.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * <p>
 * AbsFactory
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 18:05
 */
public interface AbsFactory {

    /**
     * createPizza
     *
     * @param orderType String
     * @return Pizza
     */
    Pizza createPizza(String orderType);
}
