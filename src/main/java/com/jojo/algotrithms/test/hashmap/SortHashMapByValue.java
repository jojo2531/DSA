package com.jojo.algotrithms.test.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("David", 95);
        map.put("Jane", 80);
        map.put("Mary", 97);
        map.put("Lisa", 78);
        map.put("Dino", 65);


        System.out.println(map);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println );
    }
}
