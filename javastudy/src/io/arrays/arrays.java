package io.arrays;

public class arrays {
    public static void main(String[] args) {
        int threeD[][][] = {
                {
                        { 1, 2, 3, 4, 5 },
                        { 3, 4, 3, 5, 6 },
                },
                {
                        { 3, 3, 3, 2, 6 },
                        { 3, 2, 2, 1, 2 },
                }
        };
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}