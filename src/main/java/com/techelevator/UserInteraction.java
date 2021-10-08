package com.techelevator;

import java.util.Scanner;

public class UserInteraction {
    Scanner keyboard = new Scanner(System.in);


    public void welcome(){
        System.out.println("Welcome to Vendomatic 800!");
        System.out.println("");
        System.out.println("Press 1 to display vending machine items.");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();
        if(userInput.equalsIgnoreCase("1")){
            oneToDisplayItems();
        }
    }

    public void oneToDisplayItems(){
        Items vendingItems = new Items();
        vendingItems.displayItems();

        System.out.println("");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        String itemSelection = keyboard.nextLine();


    }

    public void twoToDisplayPurchaseMenu(){
        Money moneyInputIntoMachine = new Money();
        moneyInputIntoMachine.moneyEntry();
    }

}
