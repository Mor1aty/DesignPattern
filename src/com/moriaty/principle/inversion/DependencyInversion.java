package com.moriaty.principle.inversion;

/**
 * <p>
 * 依赖倒转原则
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/28 23:02
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

/**
 * 完成 Person 接受消息的功能
 * 方式 1
 * 1. 简单
 * 2. 如果我们获取的对象是微信，短信等等，需要新增类，同时 Person 类也要新增接收相应的方法
 * 3. 引入抽象的接口 IReceiver，表示接收者，这样 Person 类与接口发生依赖
 *      因为 Email，微信等等都属于接收的范围，他们各自实现 IReceiver 接口就可以，这样就符合依赖倒转原则
 */

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}