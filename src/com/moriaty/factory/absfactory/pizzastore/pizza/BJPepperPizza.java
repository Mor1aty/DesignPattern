package com.moriaty.factory.absfactory.pizzastore.pizza;

/**
 * <p>
 * BJPepperPizza
 * </p>
 *
 * @author Moriaty
 * @since 2022/3/21 17:15
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒 pizza");
        System.out.println("北京胡椒 pizza 准备原材料");
    }
}
