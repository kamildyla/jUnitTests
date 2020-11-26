package com.jUnitTests;

import lombok.Data;

@Data
public class Dollar {

    private int amount;

    public Dollar(int amount){
        this.amount = amount;
    }

     Dollar times(int multiplier) {
        return new Dollar(this.getAmount() * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return (this.getAmount() == dollar.getAmount());
    }
}
