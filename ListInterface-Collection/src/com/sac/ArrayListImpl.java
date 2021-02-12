package com.sac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListImpl {

    private void displayArrayList(){

        //1. Initializing using add method
        List<String> arList = new ArrayList<>();
        arList.add("Sachin");
        arList.add("Naik");
        arList.add("Elon");
        arList.add("Musk");
        arList.add("Trump");
        arList.add("Donald");

        //2. Initializing using Arrays.asList - Array backed List
         arList = Arrays.asList("a","b","c","d");

         //3. Initializing using anonymous inner class method
         arList = new ArrayList<String>(){{
             add("A");
             add("B");
             add("C");
         }};

        System.out.println("List Elements while modifying the list");
        Iterator iterator = arList.iterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            System.out.println(str +"\t");
            if(str.equalsIgnoreCase("Trump"))
                iterator.remove();

        }

        System.out.println("List Elements After modifying the list");
        for (String str: arList) {
            System.out.println(str + "\t");
        }
    }

    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
        arrayList.displayArrayList();
    }
}
