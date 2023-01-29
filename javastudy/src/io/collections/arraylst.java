package io.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylst {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(3, 3, 32, 335));
      
        arrayList.add(5);
        System.out.println(arrayList.size());
        for (int i = arrayList.size(); i > 0; --i) {
            arrayList.add(i);
        }
        System.out.println(arrayList.size() + " Size");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + " ");
        }
    }

}
