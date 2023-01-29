package io.print;

public class printf {
    public static void main(String[] args) {
        var cout = System.out;
        var cin = System.in;

        cout.print("args\n");
        System.out.printf("This is a format string %d", 123);
        cout.printf("TEST %+.2f",(double)-1.2371231);
    }
}
