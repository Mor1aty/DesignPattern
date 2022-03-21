package com.moriaty.factory.absfactory.pizzastore.pizza;

/**
 * <p>
 * LDPepperPizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:16
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒 pizza");
        System.out.println("伦敦胡椒 pizza 准备原材料");
    }
}
