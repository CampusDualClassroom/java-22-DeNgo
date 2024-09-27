package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise22 {

    public static List<String> createArrayList() {

        return new ArrayList<>(List.of(
                "GKFFD", "TNANA", "MPMSL", "PSWME", "LZMLF",
                "JYEBV", "YELNT", "JSNKR", "JFESF", "TMJLL"
        ));
    }

    public static void printElementsAndIndex(List<String> customList) {

        for (int i = 0; i < customList.size(); i++) {
            System.out.println(i + " - " + customList.get(i));
        }
    }

    public static boolean addElementToList(List<String> customList, String element) {

        return customList.add(element);
    }

    public static void main(String[] args) {

        List<String> arrayList = createArrayList();
        printElementsAndIndex(arrayList);


        addElementToList(arrayList, "AAAAA");
        System.out.println("\nDespués de añadir 'AAAAA':");
        printElementsAndIndex(arrayList);
    }
}
