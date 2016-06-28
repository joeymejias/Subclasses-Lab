package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class Hatric extends Animal {
    boolean mIsRobot;
    boolean mIsAwesome;
    String mSpeak;

    public Hatric(String name){
        super(name);
        mIsRobot = true;
        mIsAwesome = true;
        mSpeak = "Beep boop beep!";
    }

    public String getDetails(){
        return mName + " is a robot! " + mIsRobot + "\n" +
                mName + " is awesome! " + mIsAwesome + "\n" +
                mName + " says " + mSpeak;
    }
}
