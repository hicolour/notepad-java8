package com.prochera.notepad.java8.stream.of;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

public class TestStreamOf {

    @Test
    public void testStreamOf() {

        List<String> output1 = Stream.of("1", "2").collect(Collectors.toList());
        assertThat(output1, hasSize(2));


        List<Integer> output2 = Stream.of(1, 2).collect(Collectors.toList());
        assertThat(output1, hasSize(2));


    }
}

