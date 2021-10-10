package com.techelevator;

import com.sun.source.tree.Tree;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Inventory   {
    TreeMap<String,Integer> allInventory = new TreeMap<>();

/*
check available
reduce quantity methods
 */
    public Inventory(ArrayList<String> listOfId) {

        for (String id : listOfId) {
            allInventory.put(id,5);

        }
    }
    // How many items are in A1----etc call this each time an item is bought
    public void reduceInventory(String location){
        allInventory.put(location,allInventory.get(location)-1);

    }
   // Inventory check are we out of stock? How many are left?
    public int getInventory(String location){
       return allInventory.get(location);

    }



    /*
        method to reduceInventory -- based on when a purchase is made of what item
        sold out -- out of stock of one item -- return sold out
     */


    public void setStartingInventory(int startingInventory) {
        this.startingInventory = startingInventory;
    }

    public int getStartingInventory() {
        return startingInventory;
    }
    private int startingInventory = 5;
    public Inventory(int startingInventory) {
        this.startingInventory = startingInventory;
    }


    }


