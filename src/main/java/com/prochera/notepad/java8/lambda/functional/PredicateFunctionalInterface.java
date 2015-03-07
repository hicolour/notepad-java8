package com.prochera.notepad.java8.lambda.functional;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(element -> predicate.test(element)).collect(Collectors.toList());
    }
}
