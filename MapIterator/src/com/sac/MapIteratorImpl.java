package com.sac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIteratorImpl {

    public void iterateThroughMap(Map<String, Integer> hsMap) {

        Set<Map.Entry<String, Integer>> hsSet = hsMap.entrySet();
        for (Map.Entry<String, Integer> entry : hsSet) {
            System.out.println("Key: " + entry.getKey() + "\t" + "Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> hsMap = new HashMap<>();
        hsMap.put("Hello ", 1);
        hsMap.put("ABC ", 2);
        hsMap.put("PQR ", 3);

        MapIteratorImpl mapIterator = new MapIteratorImpl();
        mapIterator.iterateThroughMap(hsMap);
    }

}
