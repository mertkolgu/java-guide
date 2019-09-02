package com.javase._45.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest08 {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();

        // HashSet
        set1.add("Java");
        set1.add("Ptyhon");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");

        // LinkedHashSet
        set2.add("Java");
        set2.add("Ptyhon");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("PHP");

        // TreeSet
        set3.add("Java");
        set3.add("Ptyhon");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("PHP");

        System.out.println("---HashSet---");
        for (String s : set1)
            System.out.println(s);

        System.out.println("---LinkedHashSet---");
        for (String s : set2)
            System.out.println(s);

        System.out.println("---TreeSet---");
        for (String s : set3)
            System.out.println(s);
    }
}