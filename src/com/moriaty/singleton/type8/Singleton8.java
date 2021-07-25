package com.moriaty.singleton.type8;
/**
 * <p>
 * 单例模式：枚举
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/25 23:26
 */
public class Singleton8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();
        instance2.sayOk();
    }
}

/**
 * 枚举
 */
enum Singleton {
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}
