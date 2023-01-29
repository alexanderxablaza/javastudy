package io.oops.dice;

import java.util.Random;

public class dicerollers {
    Random r;
    int n;

    public dicerollers() {
        r = new Random();
        roll();
    }

    public void roll() {
        n = r.nextInt(6) + 1;
        System.out.println(n);
    }
}
