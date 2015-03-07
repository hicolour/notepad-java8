package com.prochera.notepad.java8.lambda.functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        list.stream().forEach(consumer::accept);
    }
}
