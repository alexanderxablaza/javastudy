package io.oops.inheritances;

public class inheritances {
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c.go();
        c.stop();
        b.go();
        b.stop();
        System.out.printf("car door: %d  wheel: %d\n",c.doors, c.wheels);
        System.out.printf("bike pedal: %d wheel: %d\n",b.pedals, b.wheels);
    }
}
