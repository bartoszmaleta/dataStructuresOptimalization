package com.comapny.service.vavr;

import com.comapny.factory.Person;
import io.vavr.collection.List;
import io.vavr.control.Option;

import java.util.function.Function;

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

    // FlatMap
    public io.vavr.collection.Seq vavrFlatMap(io.vavr.collection.Seq<Option<String>> args) {
        return args
                .flatMap(Function.identity()) // same as .flatMap(arg -> arg)
                .map(String::toLowerCase);
    }

    // Object folding
    public Person vavrFold(io.vavr.collection.Seq<String> args) {
        return args
                .tail()
//                .foldLeft(new Person(args.head()), Person::addSkill);   // ANOTHER SOLUTION
                .foldLeft(new Person(args.head()), (person, arg) -> person.addSkill(arg));
    }

}
