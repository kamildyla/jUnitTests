package com.jUnitTests;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Sum implements Expression{

    Money augmend;
    Money addmend;

    public Money reduce(String to) {
        int amount = augmend.getAmount() + addmend.getAmount();
        return new Money(amount, to);
    }
}
