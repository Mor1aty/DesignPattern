package com.moriaty.principle.singleresponsibility;

/**
 * <p>
 * 单一职责原则 2
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/27 22:38
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

/**
 * 方案 2 的分析
 * 1、遵守了单一职责原则
 * 2、这样做的改动很大，即将类分解，同时修改客户端
 * 3、改进：直接诶修改 Vehicle 类，改动的代码会比较少 => 方案 3
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}
