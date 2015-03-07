package com.prochera.notepad.java8.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStream {

    public List<Apple> INVENTORY = new ArrayList<>();
    public static final Random rn = new Random();
  
    @Before
    public void init() {
//      IntStream.rangeClosed(1, 9999999).forEach(num -> INVENTORY.add(new Apple(num + "", rn.nextInt(500 - 1 + 1) + 1)));
        IntStream.rangeClosed(1, 9999999).forEach(num -> INVENTORY.add(new Apple(num + "", num)));
    }

    @Test
    public void testSingleThreadStreamFilter() {
        long t = System.currentTimeMillis();
        List<Apple> result = INVENTORY.stream().filter(apple -> apple.getWeight() > 250).collect(Collectors.toList());
        System.out.println("S:" + (System.currentTimeMillis() - t));
    }

    @Test
    public void testParallelStreamFilter() {
        long t = System.currentTimeMillis();
        List<Apple> result = INVENTORY.parallelStream().filter(apple -> apple.getWeight() > 250).collect(Collectors.toList());
        System.out.println("P:" + (System.currentTimeMillis() - t));
    }
}
