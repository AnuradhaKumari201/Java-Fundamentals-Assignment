package com.java.duplicate;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    public static void main(String[] args) {

        // Second solution : use HashSet data structure to find duplicates
        System.out.println("Duplicate elements from array using HashSet data structure");
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
        Set<String> store = new HashSet<>();
        for (String name : names)
        {
            if (store.add(name) == false)
            {
                System.out.println("found a duplicate element in array : " + name);
            }
        }
    }
}


