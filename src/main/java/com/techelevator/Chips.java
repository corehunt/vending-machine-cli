package com.techelevator;

public enum Chips {
    PotatoCrisps("A1",3.05,"Chip"),Stackers("A2",1.45,"Chip"),
    GrainWaves("A3",2.75,"Chip"),CloudPopcorn("A4",3.65,"Chip");

    private final String id;
    private final double price;
    private final String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    Chips(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}