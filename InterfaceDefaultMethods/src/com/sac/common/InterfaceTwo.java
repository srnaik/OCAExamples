package com.sac.common;

public interface InterfaceTwo {

    void anotherTextMethod();
    void testMethod();

    default void log(){
        System.out.println("Default method implementation from InterfaceTwo");
    }
}
