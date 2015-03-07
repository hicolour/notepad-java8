package com.prochera.notepad.java8.slides;


import java.util.Arrays;
import java.util.List;

public class Sample8 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);


        //first even number grater than 3
        int result = 0;
        for (int e : values) {
            if (e > 3 && e % 2 == 0) {
                result = e*2;
                break;
            }
        }

        System.out.println(result);

        System.out.println(
                values
                        .stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .findFirst()
                        .orElse(0)
        );
    }
}
