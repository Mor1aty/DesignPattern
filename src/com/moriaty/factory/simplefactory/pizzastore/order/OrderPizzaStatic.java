package com.moriaty.factory.simplefactory.pizzastore.order;

import com.moriaty.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * OrderPizzaStatic
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:51
 */
public class OrderPizzaStatic {

    public OrderPizzaStatic() {
        String orderType;
        Pizza pizza;
        do {
            orderType = getOrderType();
            pizza = SimpleFactory.createPizza2(orderType);

            if (pizza == null) {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getOrderType() {
        try {
            BufferedReader strIn =
                    new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            return strIn.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
