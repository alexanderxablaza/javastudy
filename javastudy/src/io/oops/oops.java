package io.oops;

import java.time.LocalDate;

import io.oops.dice.dicerollers;
import io.oops.human.human;

public class oops {
    public static void main(String[] args) {
        human h = new human(
                "Rob",
                LocalDate.parse("1998-03-24"),
                234);
        System.out.println(h.id);

        System.out.println(h.age);
        human h2 = new human("Ribbon", LocalDate.parse("1995-02-19"), 129);
        System.out.println(h2.id);
        System.out.println(h2.age);
        System.out.println(h2.dob);
        h2.eat();
        human hhh = new human(h);
        hhh.changename("New name");
        hhh.eat();
        dicerollers d = new dicerollers();
        d.roll();
    }
}
