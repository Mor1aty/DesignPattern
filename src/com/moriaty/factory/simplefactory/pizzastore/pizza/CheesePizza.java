package com.moriaty.factory.simplefactory.pizzastore.pizza;

/**
 * <p>
 * CheesePizza
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:09
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("cheese pizza preparing");
    }
}
