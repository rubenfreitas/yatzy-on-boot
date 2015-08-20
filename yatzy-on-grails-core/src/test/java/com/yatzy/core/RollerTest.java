package com.yatzy.core;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by rfreitas
 */
public class RollerTest {

    private static final int RUN_TIMES = 1000;

    @Test
    public void shouldGenerateValidSixFacedDicedNumbers() {
        Roller roller = new Roller();
        for(int i = 0; i < RUN_TIMES; i++) {
            int result = roller.roll();

            assertTrue(result <= 6 && result >= 1);
        }
    }
}