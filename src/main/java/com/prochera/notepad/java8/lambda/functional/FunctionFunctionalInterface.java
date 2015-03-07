package com.prochera.notepad.java8.lambda.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class FunctionFunctionalInterface {
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        list.stream().forEach(e -> result.add(function.apply(e)));
        return result;
    }
}
