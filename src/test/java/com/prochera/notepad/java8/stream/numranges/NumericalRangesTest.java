package com.prochera.notepad.java8.stream.numranges;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.fail;

public class NumericalRangesTest {
    @Test
    public void testIntStream() {
        List<Integer> output1 = IntStream.range(1, 2).boxed().collect(Collectors.toList());
        assertThat(output1, hasSize(1));

        List<Integer> output2 = IntStream.rangeClosed(1, 2).boxed().collect(Collectors.toList());
        assertThat(output2, hasSize(2));

    }
}
