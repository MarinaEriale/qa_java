package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void getKittensDefaultTest () {
        Feline feline = new Feline();
        int kittensQuantity = feline.getKittens();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensQuantityTest () {
        Feline feline = new Feline();
        int kittensQuantity = feline.getKittens(5);
        Assert.assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void getFamilyTest () {
        Feline feline = new Feline();
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatTest () throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }


}