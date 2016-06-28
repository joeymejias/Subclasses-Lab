package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Mammal extends Animal {
    String mAnimalType;
    boolean mCreatesBodyHeat;
    boolean mLaysEggs;

    public Mammal(String name){
        super(name);
        mAnimalType = "Mammal";
        mCreatesBodyHeat = true;
        System.out.println("Mammals create body heat?" + mCreatesBodyHeat);
        mLaysEggs = false;
        System.out.println("Mammals ay eggs?" + mLaysEggs);
    }

    public Mammal(int legs, int topSpeed, boolean isEndangered, String name) {
        super(legs, topSpeed, isEndangered, name);
        mAnimalType = "Mammal";
        mCreatesBodyHeat = true;
        mLaysEggs = false;
    }
}
