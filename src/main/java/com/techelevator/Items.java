package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Items {

    public String displayItems;
    private double price;
    private String productName;
    private String type;

    public Items() {
        displayItems = displayItems();
    }

    //going to have to add an inventory getter in here
    // Display the list of menu items from vendingmachine.csv file
    //while loop where it iterates through the csv file line by line using the file scanner and displays the menu items in a different format
    // A1 item: Chips price: $2.00 qty: 5
    //soutpl(line)


    public String displayItems(){
        File vendingItems = new File("vendingmachine.csv");

        try (Scanner file = new Scanner(vendingItems)){

            while(file.hasNextLine()){
                String currentLine = file.nextLine();
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return getDisplayItems();
    }

    public String getDisplayItems() {
        return displayItems;
    }

    public void setDisplayItems(String displayItems) {
        this.displayItems = displayItems;
    }
}
