package com.sac;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");// Passing comma as delimiter
        joinNames.add("Rahul");
        joinNames.add("Sachin");
        joinNames.add("Sourav");
        System.out.println(joinNames);

        StringJoiner joinPlaces = new StringJoiner(",","[","]"); //Passing delimiter, prefix and suffix
        joinPlaces.add("Los Angeles");
        joinPlaces.add("San Francisco");
        joinPlaces.add("San Jose");
        joinPlaces.add("Sacramento");

        System.out.println(joinPlaces);

        StringJoiner merge = joinPlaces.merge(joinNames);
        System.out.println(merge);

        StringJoiner mergeAgain = joinNames.merge(joinPlaces);
        System.out.println(mergeAgain);
    }
}
