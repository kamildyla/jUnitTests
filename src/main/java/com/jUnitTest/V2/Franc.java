package com.jUnitTest.V2;

class Franc extends Money {

    static double ratioToDollar = 0.5;

    Franc(double amount) {
        super(amount);
        this.currency = "CHF";
    }
}
