package com.comapny.service.vavr;

import io.vavr.collection.List;

public class VavrListService {

    // Iterate
    public io.vavr.collection.Seq<Integer> vavrIterate(Integer... ints) {
        return io.vavr.collection.Stream
                .of(ints)
                .map(i -> i + 1)
                .peek(System.out::println);
    }

    // Join
    public String vavrJoin(String... args) {
        return io.vavr.collection.List
                .of(args)
                .mkString(", ");
    }

    // Iterate with index
    public io.vavr.collection.Seq<String> vavrIterateWithIndex(String... args) {
        return List
                .of(args)
                .zipWithIndex((arg, index) -> index + ". " + arg);
    }

}
