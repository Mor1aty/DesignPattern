package com.moriaty.principle.inversion;

/**
 * <p>
 * 依赖关系传递的三种方式
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/28 23:14
 */
public class DependencyPass {
    public static void main(String[] args) {
        // 通过接口实现依赖传递
        ChangHong changHong = new ChangHong();
        OpenAndClose1 openAndClose1 = new OpenAndClose1();
        openAndClose1.open(changHong);

        // 通过构造器实现依赖传递
        HaiEr haiEr = new HaiEr();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(haiEr);
        openAndClose2.open();

        // 通过 setter 方法实现依赖传递
        Samsung samsung = new Samsung();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(samsung);
        openAndClose3.open();
    }
}

/**
 * 方式 1：通过接口实现传递依赖
 * 开关的接口
 */
interface IOpenAndClose1 {
    // 抽象方法，接受接口
    void open(ITV1 tv);
}

interface ITV1 {
    void play();
}

class ChangHong implements ITV1 {

    @Override
    public void play() {
        System.out.println("长虹电视打开了");
    }
}

class OpenAndClose1 implements IOpenAndClose1 {

    @Override
    public void open(ITV1 tv) {
        tv.play();
    }
}

/**
 * 方式 2：通过构造方法实现依赖传递
 */
interface IOpenAndClose2 {
    void open();
}

interface ITV2 {
    void play();
}

class HaiEr implements ITV2 {

    @Override
    public void play() {
        System.out.println("海尔电视打开了");
    }
}

class OpenAndClose2 implements IOpenAndClose2 {
    private ITV2 tv;

    public OpenAndClose2(ITV2 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

/**
 * 方式 3：通过 setter 方法实现依赖传递
 */
interface IOpenAndClose3 {
    void open();

    void setTv(ITV3 tv);
}

interface ITV3 {
    void play();
}

class Samsung implements ITV3 {

    @Override
    public void play() {
        System.out.println("三星电视打开了");
    }
}

class OpenAndClose3 implements IOpenAndClose3 {

    private ITV3 tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV3 tv) {
        this.tv = tv;
    }
}