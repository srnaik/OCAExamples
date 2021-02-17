package com.sac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {

        List<Integer> arList = new ArrayList<>();
        arList.add(10);
        arList.add(5);
        arList.add(7);
        arList.add(27);
        arList.add(15);
        arList.add(1);

        StreamsExample streamsExample = new StreamsExample();
        streamsExample.traditionalSum(arList);
        streamsExample.sumUsingStreamsAPI(arList);
    }


    private void traditionalSum(List list) {

        Iterator<Integer> iterator = list.iterator();
        int sum = 0;

        while (iterator.hasNext()) {
            int val = iterator.next();
            if (val > 10) {
                sum += val;
            }
        }

        System.out.println("Total Sum with Traditional Approach: " + sum);
    }

    private void sumUsingStreamsAPI(List<Integer> list){
        int sum = list.stream().filter(i -> i > 10).mapToInt(i->i).sum();
        System.out.println("Total Sum using Stream API: " + sum);
    }
}
