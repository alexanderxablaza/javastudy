package io.collections;

import java.util.LinkedList;
import java.util.List;

public class llist {
    public static void main(String[] args) {
        LinkedList<String> n = new LinkedList<>();
        n.add("A");
        System.out.println(n);
        n.add("B");
        System.out.println(n);
        n.addLast("C");
        System.out.println(n);
        n.addFirst("D");
        System.out.println(n);
        n.add(2, "E");
        System.out.println(n);
    }
}
