package com.sac.impl;

import com.sac.common.InterfaceOne;
import com.sac.common.InterfaceTwo;

public class InterfaceImpl implements InterfaceOne, InterfaceTwo {

    @Override
    public void testMethod() {
        System.out.println("testMethod() implementation");
    }

    /**
     * We have to give an implementation here since the default implementation is provided in both interfaces.
     */
    @Override
    public void log() {
        System.out.println("Default method implementation from InterfaceImpl");
    }

    @Override
    public void anotherTextMethod() {
        System.out.println("anotherTextMethod() implementation");
    }
}
