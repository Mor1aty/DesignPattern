package com.moriaty.uml.aggregation;

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
     * 可分离
     */
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
