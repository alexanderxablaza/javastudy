package io.oops.cars;

public class car {
    String make;
    public String model;
    int year;
    String color;
    double price;

    public car(String model) {
        this.model = model;
    }

    public car() {
        make = "";
        model = "";
        year = 0;
        color = "";
        price = 0.0;
    }

    public car(car o) {
        make = o.make;
        model = o.model;
        year = o.year;
        price = o.price;
        color = o.color;
    }

    public car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        System.out.println(make);
        return make;
    }

    public void drive() {
        System.out.println("Moving..");
        return;
    }

    public void brake() {
        System.out.println("Stopping..");
        return;
    }
}
