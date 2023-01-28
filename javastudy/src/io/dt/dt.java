package io.dt;

import java.util.ArrayList;
import java.util.List;

public class dt {
    // TODO:: fix this.
    public static void main(String[] args) {
        int x[] = { 3, 5, 7 };
        String s = "";

        int max = 0;
        for (int i = 0; i < x.length; i++) {
            max = x[i] > max ? x[i] : max;
            String c = "";
            for (int j = 0; j <= max; j++) {
                for (int k = 0; k < max; k++) {
                    if (k == 0 || j == 0) {
                        s += "#";
                    }
                }
            }
            
        }

        return;
    }
}
