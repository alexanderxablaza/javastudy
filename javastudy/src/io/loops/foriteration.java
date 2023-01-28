package io.loops;

public class foriteration {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 41, 2, 31, 5, 2, 1, 223 };
        for (int i : arr) {
            System.out.println(i); // sequence printing;
        }

        int td[][][] = {
                {
                        { 3, 4, 12, 5, 123, 1231, 123123, 323 },
                        { 64554, 3345, 34, 12412, 11, 686, 55, 33 }
                },
                {
                        { 23423, 2342, 11, 22, 66, 777, 553, 333 },
                        { 333, 22, 111, 222, 3377, 77, 66, 55 }
                }
        };

        for (int i[][] : td) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(k);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
