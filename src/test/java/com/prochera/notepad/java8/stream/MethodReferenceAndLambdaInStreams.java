package com.prochera.notepad.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.*;

public class MethodReferenceAndLambdaInStreams {


    public static final Apple GREEN_APPLE = new Apple("green", 150);
    public static final Apple YELLOW_APPLE = new Apple("yellow", 12);
    public static final List<Apple> INVENTORY = Arrays.asList(GREEN_APPLE, YELLOW_APPLE);

    @Test
    public void testGreenAppleWitMethodReference() {

        List<Apple> result = Apple.filterApples(INVENTORY, Apple::isGreenApple);
        assertThat(result, hasItem(GREEN_APPLE));
        assertThat(result, hasSize(1));
    }

    @Test
    public void testGreenAppleWithLambda() {
        List<Apple> result = Apple.filterApples(INVENTORY, (Apple a) -> "green".equals(a.getColor()));
        assertThat(result, hasItem(GREEN_APPLE));
        assertThat(result, hasSize(1));
    }

    @Test
    public void testGreenAndYellowAppleWithLambda() {
        List<Apple> result = Apple.filterApples(INVENTORY, (Apple a) -> "green".equals(a.getColor()) || "yellow".equals(a.getColor()));
        assertThat(result, hasItem(GREEN_APPLE));
        assertThat(result, hasItem(YELLOW_APPLE));
        assertThat(result, hasSize(2));
    }


    @Test
    public void testGreenAppleWithCollectionsFilterApi() {
        List<Apple> result = INVENTORY.stream().filter(apple -> "green".equals(apple.getColor())).collect(Collectors.toList());
        assertThat(result, hasItem(GREEN_APPLE));
        assertThat(result, hasSize(1));

        assertTrue(INVENTORY.stream().anyMatch((Apple apple) -> "green".equals(apple.getColor())));
        assertFalse(INVENTORY.stream().allMatch((Apple apple) -> "green".equals(apple.getColor())));
        assertFalse(INVENTORY.stream().noneMatch((Apple apple) -> "green".equals(apple.getColor())));

        Map<String, List<Apple>> collectedResult = INVENTORY.stream().filter(apple -> "green".equals(apple.getColor())).collect(groupingBy(Apple::getColor));
    }


}