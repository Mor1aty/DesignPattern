package com.moriaty.principle.liskov;

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
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}

/**
 * A 类
 */
class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

/**
 * B 类
 */
class B extends A {
    /**
     * 这里重写了 A 类的方法，导致调用错误
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}