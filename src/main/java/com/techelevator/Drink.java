package com.techelevator;

public enum Drink {
    Cola("C1",1.25,"Drink"), DrSalt("C2",1.50,"Drink"),
    MountainMelter("C3",1.50,"Drink"),Heavy("C4",1.50,"Drink");

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

    Drink(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}
