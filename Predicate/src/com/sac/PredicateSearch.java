package com.sac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> arlAnimals = new ArrayList<>();
        arlAnimals.add(new Animal("fish",false,true));
        arlAnimals.add(new Animal("kangaroo",true,false));
        arlAnimals.add(new Animal("rabbit",true,false));
        arlAnimals.add(new Animal("turtle",false,true));
        print(arlAnimals,a->a.isCanSwin());
        print(arlAnimals, a->a.isCanHoop());
    }

    /**
     * Using Predicate interface instead of writing separate interfaces.
     * @param animals
     * @param checker
     */
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        Object obj = null;
        for (Animal animal:animals) {
            obj = checker.test(animal);
            if(obj instanceof Boolean && (Boolean)obj){
                System.out.println(animal + " ");
            }
        }
    }
}
