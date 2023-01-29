package io.collections;

import java.util.ArrayList;

public class listarr {
    public static void main(String[] args) {
        // resizeable array = ArrayList

        ArrayList<String> c = new ArrayList<>();

        c.add("STRING");
        c.add("HAMB");
        c.add("DOG");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }

    }
}
