package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testExampleMadLib() {
        String expected = "Do you walk your blue dog quickly? That's hilarious!";
        String actual = App.madlib("dog", "walk", "blue", "quickly");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAnotherMadLib() {
        String expected = "Do you eat your green cow slowly? That's hilarious!";
        String actual = App.madlib("cow", "eat", "green", "slowly");
        Assertions.assertEquals(expected, actual);
    }
}