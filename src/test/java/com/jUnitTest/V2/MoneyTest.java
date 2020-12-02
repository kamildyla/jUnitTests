package com.jUnitTest.V2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void testCurrency() {
        Dollar dollar = new Dollar(3);
        Franc franc = new Franc(3);
        assertEquals("USD", dollar.getCurrency());
        assertEquals("CHF", franc.getCurrency());
        assertNotEquals(dollar.getCurrency(), franc.getCurrency());

    }
}