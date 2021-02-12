package com.sac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachImpl {


    public static void main(String[] args) {
        List<String> arList = new ArrayList<>();
        arList.add("1");
        arList.add("2");
        arList.add("3");

        ConsumerImpl consumer = new ConsumerImpl();
        arList.forEach(consumer);
    }
}


