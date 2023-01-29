package io.oops.human;

import java.time.LocalDate;
import java.time.Period;

public class human {
    String name;
    public int age;
    double weight;
    public LocalDate dob;

    static int nextId;
    static {
        nextId = 0;
    }
    public int id;

    public final void changename(String newname) {
        this.name = newname;
    }

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
        this.name = name;
    }

    public human(human o) {
        id = ++nextId;
        this.dob = o.dob;
        age = o.age <= 0 ? o.age : calculateAge(o.dob);
        this.weight = o.weight;
        this.name = o.name;
    }

    public void eat() {
        System.out.printf("%s is eating\n", this.name);
    }
}
