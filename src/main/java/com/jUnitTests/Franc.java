package com.jUnitTests;

public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.getAmount() * multiplier);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }
}
