package com.java.highestOccurence;

import java.util.*;

public class n_highest_occurance {
    static void print_N_mostFrequentNumber(int[] arr, int n, int k) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());

        list.sort((o1, o2) -> {
            if (Objects.equals(o1.getValue(), o2.getValue()))
                return o2.getKey() - o1.getKey();
            else
                return o2.getValue()
                        - o1.getValue();
        });

        for (int i = 0; i < k; i++)
            System.out.println(list.get(i).getKey() + "- " + list.get(i).getValue() + " times");
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 5, 6, 2, 4, 4, 4, 2};
        int n = arr.length;
        int k = 2;
        print_N_mostFrequentNumber(arr, n, k);
    }
}