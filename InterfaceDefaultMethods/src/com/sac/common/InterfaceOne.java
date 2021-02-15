package com.sac.common;

public interface InterfaceOne {

    void testMethod();

    default void log(){
        System.out.println("Default method implementation from InterfaceOne");
    }
}
