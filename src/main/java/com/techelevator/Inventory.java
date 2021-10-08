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


