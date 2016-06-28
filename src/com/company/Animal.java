package com.company;

import java.util.Scanner;

/**
 * Created by joey on 6/28/16.
 */
public class Animal {
    int mNumLegs;
    int mTopSpeed;
    boolean mIsEndangered;
    String mName;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public Animal(String name){
        mNumLegs = 0;
        mTopSpeed = 0;
        mIsEndangered = false;
        mName = name;
        System.out.println(name);
    }
}
