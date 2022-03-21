package com.moriaty.factory.absfactory.pizzastore.pizza;

/**
 * <p>
 * BjCheesePizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:14
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪 pizza");
        System.out.println("北京奶酪 pizza 准备原材料");
    }
}
