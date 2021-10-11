package com.techelevator;

import java.util.Scanner;
import java.util.TreeMap;

public class UserInteraction {
    Scanner keyboard = new Scanner(System.in);
    TreeMap<String, Product> productsMap;
    Inventory allInventory;
    Money moneyManagement = new Money();

    public void mainMenu(TreeMap<String, Product> productsMap,  Inventory inventory)  {
        this.productsMap = productsMap;
        this.allInventory = inventory;

        System.out.println("Welcome to Vendomatic 800!");
        System.out.println("");
        System.out.println("Press 1 to display vending machine items.");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();

        if (userInput.equalsIgnoreCase("1")) {
            oneToDisplayItems();
            mainMenu(productsMap,inventory);
        } else if (userInput.equalsIgnoreCase("2")) {
            purchaseMenu();

        } else if (userInput.equalsIgnoreCase("3")) {
            System.exit(0);
        }

    }




    public void purchaseMenu() {
        System.out.println("");
        System.out.println("Press 1 to feed money into the machine");
        System.out.println("Press 2 to select a product for purchase.");
        System.out.println("Press 3 to finish transaction.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();

        if (userInput.equals("1")) {
            inputMoney();

        } else if (userInput.equalsIgnoreCase("2")) {
            oneToDisplayItems();
            System.out.println("");
            System.out.println("Please enter the code of the product you would like to purchase >>> ");

            String productSelection = keyboard.nextLine().toUpperCase();
            if(productsMap.containsKey(productSelection)) {


                Product selection = productsMap.get(productSelection.toUpperCase());
                System.out.println(selection.getName() + selection.getPrice());

                //getting balance and passing through price -- returning balance left after purchase
                moneyManagement.purchasedItem(selection.getPrice());
                System.out.println("Money remaining: $" + moneyManagement.getBalance());

                if (selection.getType().equals("Chip")) {
                    //getting snack

                    System.out.println("Crunch Crunch, Yum!");

                } else if (selection.getType().equals("Candy")) {

                    System.out.println("Munch Munch, Yum!");

                } else if (selection.getType().equals("Drink")) {

                    System.out.println("Glug Glug, Yum!");

                } else {

                    System.out.println("Chew Chew, Yum!");

                }
                purchaseMenu();
            }else{//product was not found

                System.out.println("Product does not exist!");
                mainMenu(productsMap,allInventory);
            }

        } else if (userInput.equalsIgnoreCase("3")) {
            System.out.println("Thank you for using VendoMatic");
            System.out.print("Your change is: " + moneyManagement.calculateChange());

 //

        }


    }

    public void inputMoney() {
        moneyManagement.moneyEntry();
        purchaseMenu();
    }
// For each item in our products map print each line with the quantity. String concatenation
    public void oneToDisplayItems() {
        for (Product product :productsMap.values()) {
            System.out.println(product.toString() + " Inventory " + allInventory.getInventory(product.getId()));

        }
    }
    }
