package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Otter extends Mammal{
    boolean mCanSwim;
    boolean mIsOtter;

    public Otter(String name){
        super(name);
        mCanSwim = true;
        mIsOtter = true;
    }

    public Otter(int legs, int topSpeed, boolean isEndangered, String name){
        super(legs, topSpeed, isEndangered, name);
        mCanSwim = true;
        mIsOtter = true;
    }

    public String getDetails(){
        return mName + " is a " + mAnimalType + "." + "\n" +
                "Does " + mName + " lays eggs? " + mLaysEggs + "\n" +
                "Does " + mName + " regulate its own body heat? " + mCreatesBodyHeat + "\n" +
                mName + " has " + mNumLegs + " legs." + "\n" +
                mName + " can run " + mTopSpeed + " mph." + "\n" +
                "Is " + mName + " endangered? " + mIsEndangered + "\n" +
                "Can " + mName + " swim? " + mCanSwim + "\n" +
                "Is " + mName + " a baby otter? " + mIsOtter + "\n";
    }
}
