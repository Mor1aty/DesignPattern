package com.moriaty.singleton.type2;

/**
 * <p>
 * 单例模式: 饿汉式（静态代码块）
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 21:33
 */
public class Singleton2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {
    // 1. 私有化构造器
    private Singleton() {

    }

    static {
        // 2. 在静态代码块中创建单例对象
        instance = new Singleton();
    }

    private static Singleton instance;

    // 3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
