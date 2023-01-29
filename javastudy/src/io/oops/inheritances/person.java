package io.oops.inheritances;

public class person {
    String name;
    int age;
    public person() {

    }
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return this.name+"\t"+this.age;
    }
}
