package com.jUnitTest.V2;

import lombok.Data;

@Data
class Money {

    double amount;
    String currency;
    double ratioToDollar;

    Money(double amount) {
        this.amount = amount;
    }


    double times(double multiplier) {
        return this.getAmount() * multiplier;
    }

    double plus(Money money) {
        if (this.getClass().equals(money.getClass())) {
            return this.getAmount() + money.getAmount();
        }
        return 0;
    }
}
