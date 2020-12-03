package com.jUnitTest.V2;

class Dollar extends Money {

    double ratioToDollar = 1;

    Dollar(double amount) {
        super(amount);
        this.currency = "USD";
    }
}