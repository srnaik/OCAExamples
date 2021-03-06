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
        print(arlAnimals,new CheckIfHopper());

        //print(arlAnimals,a->a.isCanHoop());
        // print(arlAnimals,a->a.isCanSwin());
       // String strName = (String) print(arlAnimals,a->{return (String) a.toString();});
        // System.out.println("Returned String "+ strName);
    }

    private static void print(List<Animal> animals, CheckTrait checkTrait){
        Object obj = null;
        for (Animal animal:animals) {
            if(checkTrait.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}
