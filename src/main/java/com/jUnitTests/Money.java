package com.jUnitTests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

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
    public String toString() {
        return "Money{" +
                "amount=" + getAmount() +
                ", currency='" + getCurrency() + '\'' +
                '}';
    }


    public Expression plus(Money addend) {
        return new Money(getAmount() + addend.getAmount(), getCurrency());
    }
}
