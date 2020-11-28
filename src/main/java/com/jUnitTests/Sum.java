package com.jUnitTests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sum implements Expression{

    Expression augmend;
    Expression addmend;

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = getAugmend().reduce(bank, to).getAmount() + getAddmend().reduce(bank, to).getAmount();
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, getAddmend());
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(getAugmend().times(multiplier), getAddmend().times(multiplier));
    }
}
