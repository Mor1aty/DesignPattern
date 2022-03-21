package com.moriaty.factory.absfactory.pizzastore.pizza;

/**
 * <p>
 * LDCheesePizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:17
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪 pizza");
        System.out.println("伦敦奶酪 pizza 准备原材料");
    }
}
