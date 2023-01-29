package io.oops.human;

import java.time.LocalDate;
import java.time.Period;

public class human {
    String name;
    public int age;
    double weight;
    LocalDate dob;

    static int nextId;
    static {
        nextId = 0;
    }
    public int id;

    public human() {
        name = "";
        age = 0;
        weight = 0.0;
        id = ++nextId;
        dob = LocalDate.now();
    }

    public int id() {
        return id;
    }

    private int calculateAge(LocalDate dob) {
        LocalDate now = LocalDate.now();
        if (dob == null && now == null) {
            return 0;
        }
        return Period.between(dob, now).getYears();
    }

    public human(String name, LocalDate dob, double weight) {
        id = ++nextId;
        this.dob = dob;
        age = calculateAge(dob);
        this.weight = weight;
    }
}
