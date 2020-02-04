package com.igor;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @Before
    public void load() {
        main = new Main();
    }

    @Test
    public void shouldPositiveTest() {
        assertTrue(main.isPositive(10));
    }

    @Test
    public void shouldNotPositiveTest() {
        assertFalse(main.isPositive(-5));
    }
}