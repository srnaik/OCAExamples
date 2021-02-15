package com.sac.impl;

import com.sac.common.MyData;

public class MyDataImpl implements MyData{

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String[] args) {
        MyDataImpl myData = new MyDataImpl();
        String str = "Hello";
        myData.print(str);
        myData.isNull(str);

    }
}
