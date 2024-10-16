package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {
    private final String animalSex;
    private final boolean hasMane;

    public LionTest (String animalSex, boolean hasMane) {
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

    @Test
    public void getKittensDefaultTest () throws Exception {
       Lion lion = new Lion(animalSex, cats);
        Mockito.when(cats.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getKittensQuantityTest () throws Exception {
        Lion lion = new Lion(animalSex, cats);
        Mockito.when(cats.getKittens()).thenReturn(5);
        Assert.assertEquals(5, cats.getKittens());
    }

    @Test
    public void getFoodTest () throws Exception {
        Lion lion = new Lion(animalSex, cats);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }



}