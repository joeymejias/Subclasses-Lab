package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Reptile extends Animal {
    String mAnimalType;
    boolean mCreatesBodyHeat;
    boolean mLaysEggs;

    public Reptile(int legs, int topSpeed, boolean isEndangered, String name){
        super(legs, topSpeed, isEndangered, name);
        mAnimalType = "Reptile";
    }

    public Reptile(String name){
        super(name);
        mAnimalType = "Reptile";
        mCreatesBodyHeat = false;
        mLaysEggs = false;
    }
}
