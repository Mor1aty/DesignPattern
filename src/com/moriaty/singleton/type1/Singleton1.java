package com.moriaty.singleton.type1;

/**
 * <p>
 * 单例模式: 饿汉式（静态常量）
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 21:33
 */
public class Singleton1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态变量）
 */
class Singleton {
    // 1. 私有化构造器
    private Singleton() {

    }

    // 2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
