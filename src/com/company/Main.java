package com.company;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
        Joey joey = new Joey(2, 40, true, "Fred");
        System.out.println(joey.getDetails());

        Lizard lizard = new Lizard(4, 20, false, "Steve");
        System.out.println(lizard.getDetails());

        Otter otter = new Otter(4, 20, true, "Oliver");
        System.out.println(otter.getDetails());

        Hatric hatric = new Hatric("Hatric");
        System.out.println(hatric.getDetails());
    }
}
