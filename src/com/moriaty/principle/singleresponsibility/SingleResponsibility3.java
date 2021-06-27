package com.moriaty.principle.singleresponsibility;

/**
 * <p>
 * 单一职责原则 3
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/27 22:42
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

/**
 * 方案 3 的分析
 * 1、这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2、这里虽然在类这个级别上没有遵守单一职责原则，但是在方法这个级别上，遵守了单一职责原则
 */

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中上运行....");
    }
}
