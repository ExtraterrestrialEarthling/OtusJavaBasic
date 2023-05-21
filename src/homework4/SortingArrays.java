package homework4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArrays {

    private static ArrayList<Integer> sortArray(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }

        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>() {{
            {
                for (int i = 1000; i >= 0; i--) {
                    add(i);
                }
            }
        }};

        ArrayList<Integer> list2 = new ArrayList<>(list1);


        long start = System.currentTimeMillis();
        sortArray(list1);
        long end = System.currentTimeMillis();
        System.out.println("¬рем¤, затраченное на сортировку c помощью моего метода: " + (end - start));


        long start2 = System.currentTimeMillis();
        Collections.sort(list2);
        long end2 = System.currentTimeMillis();
        System.out.println("¬рем¤, затраченное на сортировку c метода Collections: " + (end2 - start2));


    }
}
