package com.moriaty.singleton.type3;

/**
 * <p>
 * 单例模式：懒汉式（线程不安全）
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 21:51
 */
public class Singleton3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 懒汉式（线程不安全）
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法，当使用该方法时，才会创建 instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
