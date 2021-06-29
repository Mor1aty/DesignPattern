package com.moriaty.principle.liskov.improve;

/**
 * <p>
 * 里氏替换原则
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/29 23:11
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("------------------------");

        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func3(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

/**
 * 创建一个更加基础的基类
 */
class Base {

}


/**
 * A 类
 */
class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * B 类
 * 如果 B 类需要使用 A 的方法，使用组合关系
 */
class B extends Base {

    private final A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}