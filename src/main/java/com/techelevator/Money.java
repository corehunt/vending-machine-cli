package com.techelevator;

import java.util.Scanner;

public class Money implements Calculator {
    private double balance = 0.00;
    Scanner keyboard = new Scanner(System.in);


    public Double moneyEntry(){
        boolean feedMoreMoney = true;
        double finalCashBalance = 0.00;

            while (feedMoreMoney){
                System.out.println("Please enter a whole dollar amount of $1.00, $5.00, or $10.00.");
                String input = keyboard.nextLine();
                double cashInput = Double.parseDouble(input);
                finalCashBalance += cashInput;

                System.out.println("Your cash balance is : $" + finalCashBalance);
                System.out.println("Would you like to add more cash? (Y/N)");
                String moreCashNeeded = keyboard.nextLine();
                if(moreCashNeeded.equalsIgnoreCase("N")) {
                    System.out.println("Thank You!");
                    feedMoreMoney = false;
                    System.out.println("Your final cash balance is: $" + finalCashBalance);
                    System.out.println(" ");

            }
                balance = finalCashBalance;

            } return balance;
        }

    public double getBalance() {
        return balance;
    }

    public double purchasedItem(double price){
        balance -= price;
        return balance;
    }













    @Override
    public double calculateTotal(Money enteredMoney) {
        return 0;
    }

    @Override
    public Money calculateChange(double amountOfChange) {
        return null;
    }
}
