package com.moriaty.singleton.type5;

/**
 * <p>
 * 单例模式：懒汉式（线程安全，同步代码块）
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 21:51
 */
public class Singleton5 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance: " + instance.hashCode());
        System.out.println("instance2: " + instance2.hashCode());
    }
}

/**
 * 懒汉式（线程安全，同步代码块）
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            // 在此处加同步，无法解决线程安全问题
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
