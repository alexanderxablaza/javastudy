package io.arrays;

public class op {

    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        System.out.println(value1 & value2);
        System.out.println(value1 | value2);
        System.out.println(value1 & ~value2);
        System.out.println(~value1 & value2);
        System.out.println(value1 | ~value2);
        System.out.println(~value1 | value2);
        System.out.println(value1 ^ value2);
        System.out.println(value1 >> 1);
        System.out.println(value1 << 1);

    }

    public static void ma_in(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if (value1 == 1 && value2 == 2) {
            System.out.println("v");
        }
    }

    public static void m_ain(String[] args) {
        int[] c = { 3, 5, 7 };
        int size = 0;
        String s = "";
        for (int o = 0; o < c.length; o++) {
            // System.out.println("o : " + o);
            size = c[o] > size ? c[o] : size;
            String temp = "";

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i == size || i == 1 || j == 1 || j == size) {
                        s = s.replace(s, "#");
                    } else {
                        s = s.replace(s, " ");
                    }
                }
                s = s.replace(s, "\n");
            }
        }
        System.out.println(s);
    }

    public static void maxin(String[] args) {
        int val = 1;
        int val2 = 2;

        if (val == val2) {
            System.out.println("val == val2");
        }
        return;
    }

    public static void ma2in(String[] args) {
        int cadence = 0;
        int speed = 0;
        int gear = 0;

        int i = 3;
        System.out.println(i);
        i--;
        System.out.println(i);
        i++;
        System.out.println(i);

        return;
    }

}
