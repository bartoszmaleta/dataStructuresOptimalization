package com.comapny.service.vavr;

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

}
