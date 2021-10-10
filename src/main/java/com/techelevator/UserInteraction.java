package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInteraction {
    Scanner keyboard = new Scanner(System.in);
    ItemReader map = new ItemReader();
    Money moneyInputIntoMachine = new Money();

    public void mainMenu() {
        System.out.println("Welcome to Vendomatic 800!");
        System.out.println("");
        System.out.println("Press 1 to display vending machine items.");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();
        ItemReader itemReader = new ItemReader();


        if (userInput.equalsIgnoreCase("1")) {
            oneToDisplayItems();
            mainMenu();
        } else if (userInput.equalsIgnoreCase("2")) {
            purchaseMenu();

        } else if (userInput.equalsIgnoreCase("3")) {
            System.exit(0);
        }

    }

    public void productsMenu() {
        System.out.println("Welcome to Vendomatic 800!");
        System.out.println("");
        System.out.println("Press 1 to display vending machine items.");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();
    }

    public void purchaseMenu() {
        System.out.println("");
        System.out.println("Press 1 to feed money into the machine");
        System.out.println("Press 2 to select a product for purchase.");
        System.out.println("Press 3 to finish transaction.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();


        if(userInput.equals("1")){
            inputMoney();

        } else if(userInput.equalsIgnoreCase("2")){


                System.out.println("");
                System.out.println("Please enter the code of the product you would like to purchase >>> ");

                String productSelection = keyboard.nextLine();
                Product selection = map.readItems().get(productSelection);



                if(selection.getType().equals("Chip")){
                    //getting snack
                    System.out.println(map.readItems().get(productSelection));
                    System.out.println("Crunch Crunch, Yum!");

                    //getting balance and passing through price -- returning balance left after purchase
                    moneyInputIntoMachine.purchasedItem(selection.getPrice());
                    System.out.println("Money remaining: $" + moneyInputIntoMachine.getBalance());

                } else if(selection.getType().equals("Candy")) {
                    System.out.println(map.readItems().get(productSelection));
                    System.out.println("Munch Munch, Yum!");

                    moneyInputIntoMachine.purchasedItem(selection.getPrice());
                    System.out.println("Money remaining: $" + moneyInputIntoMachine.getBalance());

                } else if(selection.getType().equals("Drink")) {
                    System.out.println(map.readItems().get(productSelection));
                    System.out.println("Glug Glug, Yum!");

                    moneyInputIntoMachine.purchasedItem(selection.getPrice());
                    System.out.println("Money remaining: $" + moneyInputIntoMachine.getBalance());

                } else {
                    System.out.println(map.readItems().get(productSelection));
                    System.out.println("Chew Chew, Yum!");

                    moneyInputIntoMachine.purchasedItem(selection.getPrice());
                    System.out.println("Money remaining: $" + moneyInputIntoMachine.getBalance());
                }
                purchaseMenu();



        } else if(userInput.equalsIgnoreCase("3")){
            System.out.println("Thank you for using VendoMatic");
            System.out.println("Your change is: ");
        }


    }
    public void inputMoney() {
        moneyInputIntoMachine.moneyEntry();
        purchaseMenu();
    }
    public void oneToDisplayItems() {
        File vendingMachine = new File("vendingmachine.csv");

        try(Scanner fileScanner = new Scanner(vendingMachine);) {
            while(fileScanner.hasNextLine()){
                String currentLine = fileScanner.nextLine();
                System.out.println(currentLine + "|Qty: 5");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }













//    public void oneToDisplayItems(){
//        Items vendingItems = new Items();
//        vendingItems.displayItems();
//    }



    }
}