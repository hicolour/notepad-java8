package com.prochera.notepad.java8.slides;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample10 {

    private static final Random rn = new Random();

    public static void main(String[] args) {


        List<Integer> keys = IntStream.rangeClosed(0, 99999999).
                asLongStream().
                mapToObj(i -> rn.nextInt(50 - 1 + 1) + 1).
                collect(Collectors.toList());




        long time = System.currentTimeMillis();
        keys.stream().filter(age -> age > 25).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        keys.parallelStream().filter(age -> age > 25).collect(Collectors.toList());
        System.out.println(System.currentTimeMillis() - time);



    }
}
