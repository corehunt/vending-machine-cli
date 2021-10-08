package com.techelevator;

import java.util.Scanner;

public class Money implements Calculator {
    //private double balance;
    Scanner keyboard = new Scanner(System.in);

    public Double moneyEntry(){
            boolean feedMoreMoney = true;
            while (feedMoreMoney){
                String input = keyboard.nextLine();
                Double cashInput = Double.parseDouble(input);


                System.out.println("Would you like to add more money? Y/N");
                String moreMoney = keyboard.nextLine();

                if(moreMoney.equalsIgnoreCase("Y")){
                    System.out.println("Please a whole dollar amount of $1, $5, or $10.");

                } else if(moreMoney.equalsIgnoreCase("N")){
                    System.out.println("Total money entered: " + cashInput);
                    feedMoreMoney = false;
                }

            }
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
