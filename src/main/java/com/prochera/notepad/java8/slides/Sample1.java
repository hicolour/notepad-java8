package com.prochera.notepad.java8.slides;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample1 {


    public static void main(String[] args) {


        // COMBINE
        System.out.println("---");
        Predicate<String> startWithJ =  s -> {
            System.out.println("start j");
            return s.startsWith("J");
        };
        Predicate<String> fourLetterLong = s -> {
            System.out.println("4L");
            return s.length()==4;
        };

        List<String> names = Arrays.asList("Tom","Mike", "Richard", "Jery", "Marek");


        System.out.println(
                names.stream()
                        .filter(fourLetterLong)
                        .filter(startWithJ)
                        .findFirst().orElse("none")

        );


//                .forEach(System.out::println);

        // COLLECT
        System.out.println("---");

        List<String> fourLetterNames =

                names.stream()
                    .filter(fourLetterLong)
                    .collect(Collectors.toList());

        fourLetterNames.forEach(System.out::println);


        //MAP
        System.out.println("---");
        names.stream()
                .map(name -> name.toUpperCase()).forEach(System.out::println);

        //DISTINCT
        System.out.println("---");
        List<Integer> values = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        values.stream()
                .distinct().forEach(System.out::println);

        //MIX MAX SUM
        System.out.println("---");
        IntSummaryStatistics stats = values.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("min:"+stats.getMin());
        System.out.println("max:"+stats.getMax());
        System.out.println("sum:"+stats.getSum());
        System.out.println("avg:"+stats.getAverage());



    }

}
