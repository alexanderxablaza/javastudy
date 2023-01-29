package io.oops.inheritances;

public class superhero extends person {
    String power;

    superhero(String name, int age, String power) {
        super(name, age);
        this.power = power;

    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.power;
    }
}