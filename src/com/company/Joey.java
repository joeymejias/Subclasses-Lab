package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Joey extends Mammal {
    boolean mIsBabyKangeroo;

    public Joey(String name){
        super(name);
        mIsBabyKangeroo = true;
    }

    public Joey(int legs, int topSpeed, boolean isEndangered, String name) {
        super(legs,topSpeed,isEndangered,name);
        mIsBabyKangeroo = true;
    }

    public String getDetails(){
        return mName + " is a " + mAnimalType + "." + "\n" +
                "Does " + mName + " lays eggs? " + mLaysEggs + "\n" +
                "Does " + mName + " regulate its own body heat? " + mCreatesBodyHeat + "\n" +
                mName + " has " + mNumLegs + " legs." + "\n" +
                mName + " can run " + mTopSpeed + " mph." + "\n" +
                "Is " + mName + " endangered? " + mIsEndangered + "\n" +
                "Is " + mName + " a baby kangeroo? " + mIsBabyKangeroo + "\n";
    }
}
