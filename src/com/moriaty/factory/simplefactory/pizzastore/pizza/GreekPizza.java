package com.moriaty.factory.simplefactory.pizzastore.pizza;

/**
 * <p>
 * GreekPizza
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:10
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("greek pizza preparing");
    }
}
