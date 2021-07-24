package com.moriaty.uml.composite;

/**
 * <p>
 * Person
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/24 23:38
 */
public class Person {

    /**
     * 聚合关系
     */
    private IdCard card;

    /**
     * 组合关系
     */
    private Head head = new Head();
}
