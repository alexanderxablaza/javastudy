package io.oops.garage;

import io.oops.cars.car;

public class garage {
    public garage() {
        name = "unnamed";
    }

    String name;

    public garage(String name) {
        this.name = name;
    }

    public void park(car c) {
        System.out.printf("The %s is parked in %s garage.\n", c.model, name);
    }
}
