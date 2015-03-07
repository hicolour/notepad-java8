package com.prochera.notepad.java8;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.mockito.MockitoAnnotations.initMocks;

public class FlavourTest {

    final Flavour flavour = new Flavour();

    @Before
    public void init() {
        initMocks(this);
    }

    @Test
    public void can() {

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
        Arrays.asList(hiddenFiles).stream().forEach(f -> System.out.println(f.getName()));
    }
}

