package io.oops.inheritances;

public class inheritances {
    public static void main(String[] args) {
        superhero newhero = new superhero("Batman",69,"$$$$$");
        System.out.println(newhero);
        person normal = new person("Terry",12);
        System.out.println(normal);
        superhero hero2 = new superhero("superman", 32, "unkillable");
        System.out.println(hero2);
    }
    public static void m_ain(String[] args) {
        dog d = new dog();
        d.speak();
        animal a = new animal();
        a.speak();
    }
    public static void _main(String[] args) {
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
