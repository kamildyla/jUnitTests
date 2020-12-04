package com.jUnitTest.v2;

class Dollar extends Money {

    static double ratioToDollar = 1;

    Dollar(double amount) {
        super(amount);
        this.currency = "USD";
    }
}