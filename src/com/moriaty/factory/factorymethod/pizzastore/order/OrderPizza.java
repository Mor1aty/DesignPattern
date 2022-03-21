package com.moriaty.factory.factorymethod.pizzastore.order;

import com.moriaty.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * OrderPizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:18
 */
public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 定义抽象方法, createPizza, 让各个工厂子类自己实现
     *
     * @param orderType String
     * @return Pizza
     */
    abstract Pizza createPizza(String orderType);

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
