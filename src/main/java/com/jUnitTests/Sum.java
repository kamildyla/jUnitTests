package com.jUnitTests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sum implements Expression{

    Money augmend;
    Money addmend;

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = getAugmend().getAmount() + getAddmend().getAmount();
        return new Money(amount, to);
    }

}
