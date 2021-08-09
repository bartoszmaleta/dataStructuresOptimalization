package com.comapny.service.list;

import java.util.stream.Collectors;

public class UtilListService {

    // Iterate
    public java.util.List<Integer> legacyIterate(Integer... ints) {
        return java.util.Arrays
                .stream(ints)
                .map(i -> i + 1)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    // Join
    public String legacyJoin(String... args) {
        return java.util.Arrays
                .stream(args)
                .collect(Collectors.joining(", "));
    }

    public String stringJavaJoiner(String... args) {
        return String.join(", ", args);
    }


}
