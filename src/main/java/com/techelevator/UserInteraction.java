package com.techelevator;

import java.util.Scanner;

public class UserInteraction {
    Scanner keyboard = new Scanner(System.in);


    public void mainMenu(){
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
                mainMenu();
            } else if(userInput.equalsIgnoreCase("2")) {
            purchaseMenu();
            twoToInputMoney();
        } else if(userInput.equalsIgnoreCase("3")){
            System.exit(0);
        }

        }
    public void purchaseMenu(){
        System.out.println("");
        System.out.println("Press 1 to feed money into the machine");
        System.out.println("Press 2 to select a product for purchase.");
        System.out.println("Press 3 to finish transaction.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();
    }


//


    public void oneToDisplayItems(){
        Items vendingItems = new Items();
        vendingItems.displayItems();
    }

    public void twoToInputMoney(){
        Money moneyInputIntoMachine = new Money();
        moneyInputIntoMachine.moneyEntry();
    }

}
