package com.techelevator;

import java.util.Scanner;

public class Money implements Calculator {
    //private double balance;
    Scanner keyboard = new Scanner(System.in);

    public int moneyEntry(){
        boolean feedMoreMoney = true;
        int finalCashBalance = 0;

            while (feedMoreMoney){
                System.out.println("Please enter a whole dollar amount of $1, $5, or $10.");
                String input = keyboard.nextLine();
                int cashInput = Integer.parseInt(input);
                finalCashBalance += cashInput;

                System.out.println("Your cash balance is : $" + finalCashBalance);
                System.out.println("Would you like to add more cash? (Y/N)");
                String moreCashNeeded = keyboard.nextLine();
                if(moreCashNeeded.equalsIgnoreCase("N")) {
                    System.out.println("Thank You!");
                    feedMoreMoney = false;
                    System.out.println("Your final cash balance is: $" + finalCashBalance);
            }
            } return finalCashBalance;
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
