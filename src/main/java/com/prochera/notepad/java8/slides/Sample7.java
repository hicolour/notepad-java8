package com.prochera.notepad.java8.slides;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sample7 {


    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);





        System.out.println(totalValues(values));
        System.out.println(totalEvenValues(values));
        System.out.println(totalOddValues(values));
//
        System.out.println(total(values,e -> e % 2 == 0));
        System.out.println(totall(values, e -> e % 2 == 0));
    }

    private static int total(List<Integer> values, Predicate<Integer> predicate) {
        int total = 0;
        for (int e : values) {
            if(predicate.test(e)) total +=e;
        }
        return total;
    }





    private static int totall(List<Integer> values, Predicate<Integer> predicate) {
        return values
                .stream()
                .filter(predicate)
                .reduce(0, (c, e) -> c + e);
    }


    private static int totalOddValues(List<Integer> values) {
        int total = 0;
        for (int e : values) {
            if(e %2 !=0) total +=e;
        }
        return total;
    }

    private static int totalEvenValues(List<Integer> values) {
        int total = 0;
        for (int e : values) {
            if(e %2 ==0) total +=e;
        }
        return total;
    }

    private static int totalValues(List<Integer> values) {
        int total = 0;
        for (int e : values) {
            total +=e;
        }
        return total;
    }


}
