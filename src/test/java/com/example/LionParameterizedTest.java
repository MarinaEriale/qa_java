package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String animalSex;
    private final boolean hasMane;

    public LionParameterizedTest (String animalSex, boolean hasMane) {
        this.animalSex = animalSex;
        this.hasMane = hasMane;
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Cats cats;

    @Parameterized.Parameters
    public static Object[][] animalSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest () throws Exception {
        Lion lion = new Lion(animalSex, cats);
        Assert.assertEquals(lion.doesHaveMane(), hasMane);
    }
}