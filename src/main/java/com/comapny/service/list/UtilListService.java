package com.comapny.service.list;

import java.util.ArrayList;
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

    // Iterate with index
    public java.util.List<String> legacyIteratWithIndex1(String... args) {
        java.util.List<String> result = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            result.add(i + ". " + args[i]);
        }
        return result;
    }


    public java.util.List<String> legacyIterateWithIndex2(String... args) {
        return java.util.stream.IntStream
                .range(0, args.length)
                .mapToObj(index -> index + ". " + args[index])
                .collect(Collectors.toList());
    }
}
