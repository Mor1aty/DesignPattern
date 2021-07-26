package com.moriaty.factory.simplefactory.pizzastore.order;

/**
 * <p>
 * PizzaStore
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:24
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();
        new OrderPizzaImprove(new SimpleFactory());
        new OrderPizzaStatic();
    }

}
