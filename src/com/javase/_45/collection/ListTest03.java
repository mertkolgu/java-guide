package com.javase._45.collection;

import java.util.Arrays;
import java.util.List;

public class ListTest03 {

    public static void main(String[] args) {

        String[] array = {"element1", "element2", "element3", "element4"};
        List list = Arrays.asList(array);

        // list.add("element5");   // java.lang.UnsupportedOperationException
        // Arrays.asList ile bir arrayden List oluşturduğumuzda eleman eklememize izin vermez!

        list.set(1, "element2_new");
        // benzer şekilde listedeki elemanı güncellediğimizde array de güncellenir!

        for (String str : array)
            System.out.println(str);

        // public static <T> List<T> asList(T... a) {
        List list2 = Arrays.asList("e1", "e2"); // T -> String
        System.out.println(list2);

        for (int i = 0; i < list.size(); i++) {
            //
        }

        for (Object o : list) {
            //
        }
    }
}