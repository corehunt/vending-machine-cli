package com.techelevator;

public class Inventory extends Items {
    /*
        method to reduceInventory -- based on when a purchase is made of what item
        sold out -- out of stock of one item -- return sold out
     */
    public Inventory(){
        super();
    }

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


