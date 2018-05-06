package com.sac;

public class Animal {

    private String species;
    private boolean canHoop;
    private boolean canSwin;

    public Animal(String species, boolean canHoop, boolean canSwin){
        this.species = species;
        this.canHoop = canHoop;
        this.canSwin = canSwin;
    }

    public boolean isCanHoop() {
        return canHoop;
    }

    public boolean isCanSwin() {
        return canSwin;
    }

    @Override
    public String toString() {
        return species;
    }
}
