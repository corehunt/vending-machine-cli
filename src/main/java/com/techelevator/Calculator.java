package com.techelevator;

public interface Calculator {
    double calculateTotal(Money enteredMoney);
    Money calculateChange(double amountOfChange);
}
