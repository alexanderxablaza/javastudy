package io.print;

public class finals {
    public final void m(double d) {
        System.out.printf("SURROUNDED! %.2f\n", d);
        return;
    }

    public static void main(String[] args) {
        final double pi = 3.145159;
        finals f = new finals();
        f.m(pi);
    }
}
