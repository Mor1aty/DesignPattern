package com.moriaty.singleton.type6;

/**
 * <p>
 * 单例模式：双重检查
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 22:07
 */
public class Singleton6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 双重检查
 */
class Singleton {
    private Singleton() {

    }

    private static volatile Singleton instance;

    // 双重 instance == null 判断
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
