package com.comapny.service.map;

public class HashMapService {

    public static final java.util.Map<Integer, String> myMap = new java.util.HashMap<>();
    static {
        myMap.put(1, "one");
        myMap.put(2, "two");
    }

    public static final java.util.Map<Integer, String> myJava9Map = java.util.Map.of(
            1, "one",
            2, "two"
    );
}
