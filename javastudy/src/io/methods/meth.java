package io.methods;

public class meth {
    public static void main(String[] args) {
        // method = block of codes
        hi("Jbor");
        int z = add(3, 2);
        add(1,2,3);
        System.out.println(Integer.toString(z));
    }

    private static void hi(String name) {
        System.out.printf("HELLO! %s\n", name);
        return;
    }

    static int add(int x, int y) {
        return x + y;

    }
    static void add(int x, int y, int z) {

    }
}
