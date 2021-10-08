package com.techelevator;

public enum Gum  {

    UChews("D1",0.85,"Gum"),LittleLeagueChew("D2",0.95,"Gum"),
    Chiclets("D3",0.75,"Gum"),Triplemint("D4",0.75,"Gum");

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

    Gum(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}
