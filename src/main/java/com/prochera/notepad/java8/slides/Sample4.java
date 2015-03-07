package com.prochera.notepad.java8.slides;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Sample4 {

    /* THINGS TO REMEMBER
    *
    * local variables referenced -> final or effectively final
    *z
    * */

    static int z = 5;
    static Consumer<Integer> consumer = x -> System.out.println(x*z);

    public static void main(String[] args) {

        int factor =2;
        List<Integer> primes = Arrays.asList(2, 3, 5, 7);
//        primes.forEach(x -> factor += x);

    }

 }
