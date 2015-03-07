package com.prochera.notepad.java8.lambda.functional;

import com.prochera.notepad.java8.stream.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class PredicateFunctionalInterfaceTest {

    @Test
    public void testPredicateFunctionalInterface() {
        // Given
        // Setup the system under test
        List<Apple> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(i -> list.add(new Apple("color-" + i, i)));

        // When
        // Execute the system under test
        Predicate<Apple> predicate = (Apple a) -> a.getWeight() > 5;
        List<Apple> intrfaceList = PredicateFunctionalInterface.filter(list, predicate);

        List<Apple> inlineList = PredicateFunctionalInterface.filter(list, (Apple a) -> a.getWeight() > 5);
        // Then
        // Assert that the expected change has occurred

        assertThat(intrfaceList, hasSize(5));
        assertThat(inlineList, hasSize(5));
    }
}