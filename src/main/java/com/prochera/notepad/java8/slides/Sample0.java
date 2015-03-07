package com.prochera.notepad.java8.slides;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample0 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        for (int e : list) {

        }

//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//
//            }
//        });

//        Consumer<Integer> consumer = e -> System.out.println(e);
//
//        list.forEach(consumer);

//        test(() -> System.out.println("hello lambda"));

    }

//    public static void test(Runnable runnable) {
//        runnable.run();
//    }

}
