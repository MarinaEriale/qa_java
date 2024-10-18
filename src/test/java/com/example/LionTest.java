package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Cats cats;

    @Test(expected = Exception.class)
    public void doesHaveManeExceptionTest () throws Exception {
        Lion lion = new Lion("Котик", cats);
        Assert.assertEquals(lion.doesHaveMane(), true);
    }

    @Test
    public void getKittensDefaultTest () throws Exception {
       Lion lion = new Lion("Самец", cats);
        Mockito.when(cats.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getKittensQuantityTest () throws Exception {
        Lion lion = new Lion("Самка", cats);
        Mockito.when(cats.getKittens()).thenReturn(5);
        Assert.assertEquals(5, lion.getKittens());
    }

    @Test
    public void getFoodTest () throws Exception {
        Lion lion = new Lion("Самец", cats);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}