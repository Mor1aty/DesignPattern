package com.moriaty.factory.factorymethod.pizzastore;

import com.moriaty.factory.factorymethod.pizzastore.order.BJOrderPizza;
import com.moriaty.factory.factorymethod.pizzastore.order.LDOrderPizza;

/**
 * <p>
 * PizzaStore
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:38
 */
public class PizzaStore {
    public static void main(String[] args) {
        new BJOrderPizza();
        new LDOrderPizza();
    }
}
