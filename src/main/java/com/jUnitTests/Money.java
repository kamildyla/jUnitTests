package com.jUnitTests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Money implements Expression{
    protected int amount;
    protected String currency;

    protected String currency() {
        return getCurrency();
    }

    public Money times(int multiplier) {
        return new Money(getAmount() * multiplier, getCurrency());
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
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
                ", currency='" + getCurrency() + '\'' +
                '}';
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }
}
