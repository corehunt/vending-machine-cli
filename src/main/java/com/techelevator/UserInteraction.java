package com.techelevator;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserInteraction {
    Scanner keyboard = new Scanner(System.in);


    public void welcome(TreeMap<String, Product> productsMap){
        System.out.println("Welcome to Vendomatic 800!");
        System.out.println("");
        System.out.println("Press 1 to display vending machine items.");
        System.out.println("Press 2 to purchase.");
        System.out.println("Press 3 to exit.");
        System.out.println("");

        System.out.print("Please make your selection >>> ");
        String userInput = keyboard.nextLine();
        if(userInput.equalsIgnoreCase("1")){
            oneToDisplayItems(productsMap);
        }

    }

    public void oneToDisplayItems(TreeMap<String, Product> productsMap){
        for(Product product: productsMap.values()){
            System.out.println(product);
        }



    }

    public void twoToDisplayPurchaseMenu(){
        Money moneyInputIntoMachine = new Money();
        moneyInputIntoMachine.moneyEntry();
    }

}
