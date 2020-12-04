package com.jUnitTest.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    Dollar dollar = new Dollar(3);
    Franc franc = new Franc(3);

    @Test
    void testCurrency() {
        assertEquals("USD", dollar.getCurrency());
        assertEquals("CHF", franc.getCurrency());
        assertNotEquals(dollar.getCurrency(), franc.getCurrency());
    }

    @Test
    void testMultiplication() {
        assertEquals(6, dollar.times(2));
        assertEquals(6, franc.times(2));
    }

    @Test
    void testAddition() {
        Dollar dollar1 = new Dollar(2);
        Franc franc1 = new Franc(2);
        assertEquals(5, dollar.plus(dollar1));
        assertEquals(5, franc.plus(franc1));
        assertNotEquals(5, franc.plus(dollar1));

        assertEquals(9, dollar.plus(franc));
        assertEquals(4.5, franc.plus(dollar));
    }


}