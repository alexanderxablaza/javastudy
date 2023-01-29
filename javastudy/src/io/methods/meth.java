package io.methods;

public class meth {
    public static void main(String[] args) {
        // method = block of codes
        hi("Jbor");
        int z = add(3, 2);
        System.out.println(Integer.toString(z));
    }

    private static void hi(String name) {
        System.out.printf("HELLO! %s\n", name);
        return;
    }

    static int add(int x, int y) {
        return x + y;

    }
}
