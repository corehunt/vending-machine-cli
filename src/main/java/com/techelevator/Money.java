package com.techelevator;

import java.util.Scanner;

public class Money {
    private double balance = 0.00;
    Scanner keyboard = new Scanner(System.in);


    public Double moneyEntry() {
        boolean feedMoreMoney = true;
        double finalCashBalance = 0.00;

        while (feedMoreMoney) {
            System.out.println("Please enter a whole dollar amount of $1.00, $5.00, or $10.00.");
            String input = keyboard.nextLine();
            double cashInput = Double.parseDouble(input);
            finalCashBalance += cashInput;

            System.out.println("Your cash balance is : $" + finalCashBalance);
            System.out.println("Would you like to add more cash? (Y/N)");
            String moreCashNeeded = keyboard.nextLine();
            if (moreCashNeeded.equalsIgnoreCase("N")) {
                System.out.println("Thank You!");
                feedMoreMoney = false;
                System.out.println("Your final cash balance is: $" + finalCashBalance);
                System.out.println(" ");

            }
            balance = finalCashBalance;

        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public double purchasedItem(double price) {
        balance -= price;
        return balance;
    }

    public String calculateChange() {

        double quarter = .25;
        double dime = .10;
        double nickle = .05;
        int quarterCounter = 0;
        int dimeCounter = 0;
        int nickleCounter = 0;

        while (balance > 0) {

            if (balance >= quarter) {
                balance -= .25;
                quarterCounter ++;
            } else if (balance >= dime) {
                balance -= .10;
                dimeCounter ++;
            } else if (balance >= nickle) {
                balance -= .05;
                nickleCounter ++;
            }
        }

        return quarterCounter + "Quarters " + dimeCounter + "Dimes " + nickleCounter  + "Nickles ";
    }
}
