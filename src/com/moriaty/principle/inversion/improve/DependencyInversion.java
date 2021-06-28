package com.moriaty.principle.inversion.improve;

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
        person.receive(new WeChat());
    }
}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：Hello World";
    }
}

class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信消息：Hello World";
    }
}

/**
 * 完成 Person 接受消息的功能
 * 方式 2
 */
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}