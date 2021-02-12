package com.sac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListImpl {


    public void createSynchronizedListByUsingCollectionMethod(){

        List<String> syncAl = Collections.synchronizedList(new ArrayList<>());
        syncAl.add("A");
        syncAl.add("B");
        syncAl.add("D");
        syncAl.add("C");

        System.out.println("Iterating Synchronized List");
        synchronized (syncAl){
            for (String str: syncAl) {
                System.out.println(str + " ");
            }
        }
    }

    public void createSynchronizedListByUsingCopyOnWriteArrayList(){
        CopyOnWriteArrayList<String> syncAl = new CopyOnWriteArrayList<>();
        syncAl.add("A");
        syncAl.add("B");
        syncAl.add("D");
        syncAl.add("C");

        for (String str: syncAl) {
            System.out.println(str + " ");
        }
    }

    public static void main(String[] args) {
        SynchronizedArrayListImpl list = new SynchronizedArrayListImpl();
        list.createSynchronizedListByUsingCollectionMethod();
        list.createSynchronizedListByUsingCopyOnWriteArrayList();
    }
}
