package com.moriaty.factory.simplefactory.pizzastore.order;

import com.moriaty.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * OrderPizzaImprove
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:43
 */
public class OrderPizzaImprove {
    SimpleFactory simpleFactory;

    Pizza pizza = null;

    public OrderPizzaImprove(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = getOrderType();
            pizza = this.simpleFactory.createPizza(orderType);

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
