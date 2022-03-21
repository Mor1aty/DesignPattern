package com.moriaty.factory.factorymethod.pizzastore.pizza;

/**
 * <p>
 * Pizza
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/26 23:07
 */
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cutting");
    }

    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
