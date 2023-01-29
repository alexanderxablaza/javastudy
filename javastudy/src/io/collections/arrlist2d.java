package io.collections;

import java.util.ArrayList;

public class arrlist2d {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        String[] primAnimal = { "cat", "dog", "rat", "bird" };

        for (String element : primAnimal) {
            System.out.println(element);
        }
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        for (String e : animals) {
            System.out.println(e);
        }
    }

    public static void ma_in(String[] args) {
        ArrayList<String> blist = new ArrayList<>();
        blist.add("pasta");
        blist.add("donut");
        blist.add("cream");
        System.out.println(blist.get(0));
        ArrayList<String> blist2 = new ArrayList<>();
        blist2.add("tomato");
        blist2.add("pineabble");
        blist2.add("corn");
        System.out.println(blist2.get(0));
        ArrayList<String> blist3 = new ArrayList<>();
        blist3.add("mineral");
        blist3.add("gold");
        blist3.add("copper");
        System.out.println(blist3.get(0));

        ArrayList<ArrayList<String>> grocery = new ArrayList<>();
        grocery.add(blist);
        grocery.add(blist2);
        grocery.add(blist3);
        System.out.println(grocery);
        System.out.println(grocery.get(0).get(2));

    }
}
