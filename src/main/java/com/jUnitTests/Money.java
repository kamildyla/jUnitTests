package com.jUnitTests;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Money implements Expression{
    protected final int amount;
    protected final String currency;

    String currency() {
        return getCurrency();
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return (this.getAmount() == money.getAmount())
                && (this.currency().equals(money.getCurrency()));
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money((this.getAmount() / bank.rate(this.getCurrency(), to)), to);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + getAmount() +
                ", currency='" + getCurrency() + '\'' + '}';
    }

    @Override
    public Money times(int multiplier) {
        return new Money(getAmount() * multiplier, getCurrency());
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
