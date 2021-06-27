package com.moriaty.principle.singleresponsibility;
/**
 * <p>
 * 单一职责原则 1
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/27 22:35
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 * 方案 1
 * 1、在方式 1 的 run 方法中，违反了单一职责原则
 * 2、解决方案：可以根据交通工具运行的方法不同，分解成不同类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }
}
