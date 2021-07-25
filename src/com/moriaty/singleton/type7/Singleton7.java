package com.moriaty.singleton.type7;


/**
 * <p>
 * 单例模式：静态内部类
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 22:15
 */
public class Singleton7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 静态内部类
 */
class Singleton {

    private Singleton() {

    }

    private static volatile Singleton instance;

    // 写一个静态内部类，不会在一开始就进行类装载
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
