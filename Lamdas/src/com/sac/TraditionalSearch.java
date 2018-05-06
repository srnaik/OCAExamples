package com.sac;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> arlAnimals = new ArrayList<>();
        arlAnimals.add(new Animal("fish",false,true));
        arlAnimals.add(new Animal("kangaroo",true,false));
        arlAnimals.add(new Animal("rabbit",true,false));
        arlAnimals.add(new Animal("turtle",false,true));
        print(arlAnimals,a->a.isCanHoop());
        print(arlAnimals,a->a.isCanSwin());

    }

    private static void print(List<Animal> animals, CheckTrait checkTrait){
        for (Animal animal:animals) {
            if(checkTrait.test(animal)){
                System.out.println(animal + " ");
            }
        }

    }
}
