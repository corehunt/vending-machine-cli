package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ItemReader {


    //going to have to add an inventory getter in here
    // Display the list of menu items from vendingmachine.csv file
    //while loop where it iterates through the csv file line by line using the file scanner and displays the menu items in a different format
    // A1 item: Chips price: $2.00 qty: 5
    //soutpl(line)


    public static TreeMap<String, Product> readItems(){
        File vendingItems = new File("vendingmachine.csv");
        TreeMap<String, Product> productsMap = new TreeMap<>();
        try (Scanner file = new Scanner(vendingItems)){

            while(file.hasNextLine()){
                String line = file.nextLine();
                String[] parts = line.split("\\|");
                Product product = new Product(parts[0],parts[1],Double.valueOf(parts[2]),parts[3]);
                productsMap.put(product.getId(),product);

              //  System.out.println(currentLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return productsMap;
    }


}
