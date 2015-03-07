package com.prochera.notepad.java8.lambda.methodref;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class TestMethodReference {

    Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);

    @Test
    public void testWithLambda() {


        int a = stringToInteger.apply("5");

//        assertEquals(stringToInteger.apply("5"), 5);


        assertEquals(5, a);



    }
}
