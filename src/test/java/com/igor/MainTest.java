package com.igor;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MainTest {
    private Main main;

    @BeforeClass
    public void load() {
        main = new Main();
    }

    @Test
    public void shouldPositiveTest() {
        System.out.println("First test is running");
        assertTrue(main.isPositive(10));
        System.out.println("Done");
    }

    @Test
    public void shouldNotPositiveTest() {
        System.out.println("Second test is running");
        assertFalse(main.isPositive(-5));
        System.out.println("Done");
    }
}