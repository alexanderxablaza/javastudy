package io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cars {
    public static void maimn(String[] args) {

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Mustang";
        cars[0][2] = "Jaguar";
        cars[1][0] = "Silverado";
        cars[1][1] = "Corvette";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Aventador";
        cars[2][1] = "Skyline GT";
        cars[2][2] = "Jeep";
        for (int i = 0; i < cars.length; i++) {
            System.out.print("{");
            for (int j = 0; cars[i].length > j; j++) {
                System.out.print(cars[i].length - 1 != j ? cars[i][j] + ", " : cars[i][j] + "}");
            }
            System.out.println();
        }
    }

    public static void mai_n(String[] args) {
        String name = "alex     ";
        boolean result = name.equalsIgnoreCase("Alex");
        System.out.println(result);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("a", "B"));
        return;
    }

    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>(Arrays.asList(3, 5, 7));
        List<Integer> x = new ArrayList<>(c);
        Collections.sort(c);
        Collections.sort(x, Collections.reverseOrder());
        int size = c.size();
        int max = x.get(0);
        List<Character> s = new ArrayList<>();

        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                if (i == 0 || i == max || j == max || j == 0) {
                    s.add(j, '#');
                    // s.set(j - 1, '#');
                } else {
                    s.add(j, ' ');
                }
            }
            s.add(i, '\n');
        }
        System.out.println(s.toString());

    }

    public static void car1d(String[] args) {
        String cars[] = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Mustang";
        cars[2] = "Corvette";
        for (String car : cars) {
            System.out.println(car);
        }

    }
}