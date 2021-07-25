package com.moriaty.singleton.type4;

/**
 * <p>
 * 单例模式：懒汉式（线程安全，同步方法）
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 21:51
 */
public class Singleton4 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 懒汉式（线程安全，同步方法）
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的公有方法，加入了同步处理的代码，解决了线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
