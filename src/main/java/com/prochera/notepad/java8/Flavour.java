package com.prochera.notepad.java8;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flavour {

    final static Random rn = new Random();

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> keys = IntStream.rangeClosed(0, 99999999).
                asLongStream().
                mapToObj(i -> rn.nextInt(50 - 1 + 1) + 1).
                collect(Collectors.toList());




        long time = System.currentTimeMillis();
        keys.stream().filter(age -> age > 25).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        keys.stream().filter(age -> age > 25).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis() - time);


//
//
////        list.forEach(x -> System.out.println(x));
//        int i = 0;
//        Predicate<Integer> predicate = p -> {
//
//            return true;
//        } ;
//
//        BiConsumer<Integer,Integer> bc = Flavour::test2;
//
//
//        bc.accept(1,2);
//
//
//        Consumer<Integer> consumer = System.out::println;
//
//        list.forEach(consumer);
//
//
//        int myValue = list.stream().filter(predicate).findFirst().orElse(0);
//        System.out.println(myValue);
//
//        test(() -> System.out.println("hello my runnable"));

    }

    public static final void test(Runnable runnable) {
        runnable.run();

    }


    public static void test2(int x, int y) {
        System.out.println(x + " " + y);
    }

}
