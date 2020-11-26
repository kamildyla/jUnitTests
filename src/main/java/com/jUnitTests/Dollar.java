package com.jUnitTests;

public class Dollar extends Money{

    public Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(this.getAmount() * multiplier);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }
}
