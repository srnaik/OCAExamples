package com.sac.common;

public interface MyData {

    /**
     * 1. Interface static methods in Java are visible to Interfaces only.
     * 2. They are good providing utility methods/implementations.
     * 3. A class, implementing the interface can't override the Interface static method.
     *
     * @param str
     * @return
     */
    static boolean isNull(String str) {
        System.out.println("Interface implementation of isNull(String str) method");
        return str == null ? true : "".equals(str) ? true : false;
    }

    default void print(String str) {

        if (!isNull(str)) {
            System.out.println(str);
        } else {
            System.out.println("Give String is either null or empty");
        }
    }
}
