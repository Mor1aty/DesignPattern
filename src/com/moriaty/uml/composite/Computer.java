package com.moriaty.uml.composite;

/**
 * <p>
 * Computer
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/24 23:30
 */
public class Computer {
    /**
     * 不可分离
     */
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();
}
