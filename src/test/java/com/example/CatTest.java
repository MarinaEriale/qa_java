package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

//@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void getSoundTest () {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    //

    @Test
    public void getFoodTest () throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        //Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}