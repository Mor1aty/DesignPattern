package com.moriaty.factory.simplefactory.pizzastore.order;

import com.moriaty.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.moriaty.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.moriaty.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * OrderPizza
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:11
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza;
        String orderType;
        do {
            orderType = getOrderType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("greek pizza");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("cheese pizza");
            } else {
                break;
            }
            // 输出
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 获取用户输入的 Pizza 种类
     *
     * @return String
     */
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
