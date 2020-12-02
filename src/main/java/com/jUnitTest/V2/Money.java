package com.jUnitTest.V2;

import lombok.Data;

@Data
abstract class Money {

    int amount;
    String currency;

    public Money(int amount) {
        this.amount = amount;
    }
}
