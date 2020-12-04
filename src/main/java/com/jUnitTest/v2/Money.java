package com.jUnitTest.v2;

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
        else if ((this.getClass().equals(Dollar.class) && (money.getClass().equals(Franc.class)))) {
            return this.getAmount() + (money.getAmount() / Franc.ratioToDollar);
        }
        else if ((this.getClass().equals(Franc.class) && (money.getClass().equals(Dollar.class)))) {
            return this.getAmount() + (money.getAmount() * Franc.ratioToDollar);
        }
        return 0;
    }
}
