package com.sac;

public class CheckIfHopper implements CheckTrait{

    @Override
    public boolean test(Animal a) {
        return a.isCanHoop();
    }
}
