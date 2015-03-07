package com.prochera.notepad.java8.lambda.functional;

import com.prochera.notepad.java8.stream.Apple;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.*;

public class FunctionFunctionalInterfaceTest {

    
    @Test
    public void testFunctionFunctionalInterface() {
        // Given
        // Setup the system under test
        List<Apple> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(i -> list.add(new Apple("color-" + i, i)));
        // When
        // Execute the system under test

        List<Integer> result = FunctionFunctionalInterface.map(list, (Apple a) -> a.getWeight());
        // Then
        // Assert that the expected change has occurred
        assertThat(result, hasSize(10));

        List<Integer> output = list.stream().map(Apple::getWeight).filter(weight -> weight > 2).collect(Collectors.toList());
        assertThat(output,hasSize(8));

        
    }
}