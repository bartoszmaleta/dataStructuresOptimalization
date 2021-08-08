package com.comapny.service.vavr;

public class VavrMapService {

    // functional way
    public static final io.vavr.collection.Map<Integer, String> myVavrMap = io.vavr.collection.HashMap.of(
            1, "one"
            , 2, "two"
    );
}
