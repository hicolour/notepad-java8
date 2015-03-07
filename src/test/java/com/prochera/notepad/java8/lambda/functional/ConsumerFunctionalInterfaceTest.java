package com.prochera.notepad.java8.lambda.functional;

import com.prochera.notepad.java8.stream.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class ConsumerFunctionalInterfaceTest {

    @Test
    public void testConsumerFunctionalInterface() {
        // Given
        // Setup the system under test
        List<Apple> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(i -> list.add(new Apple("color-" + i, i)));
        // When
        // Execute the system under test
        Consumer<Apple> consumer = (Apple a) -> a.setWeight(a.getWeight() * 10);
        ConsumerFunctionalInterface.forEach(list, consumer);

        // Then
        // Assert that the expected change has occurred
        assertThat(list.stream().filter(a -> a.getWeight() >= 10).collect(Collectors.toList()), hasSize(10));
    }
}