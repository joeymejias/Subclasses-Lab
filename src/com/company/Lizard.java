package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Lizard extends Reptile {
    boolean mHasScales;

    public Lizard(String name){
        super(name);
        mHasScales = true;
    }

    public Lizard(int legs, int topSpeed, boolean isEndangered, String name) {
        super(legs, topSpeed, isEndangered, name);
    }

    public String getDetails(){
        return mName + " is a " + mAnimalType + "." + "\n" +
                    "Does " + mName + " lays eggs? " + mLaysEggs + "\n" +
                    "Does " + mName + " regulate its own body heat? " + mCreatesBodyHeat + "\n" +
                    mName + " has " + mNumLegs + " legs." + "\n" +
                    mName + " can run " + mTopSpeed + " mph." + "\n" +
                    "Is " + mName + " endangered? " + mIsEndangered + "\n" +
                    "Does " + mName + " have scales? " + mHasScales + "\n";
    }
}
