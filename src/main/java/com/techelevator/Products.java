package com.techelevator;

public enum Products {
    PotatoCrisps("A1",3.05,"Chip"), Stackers("A2",1.45,"Chip"),
    GrainWaves("A3",2.75,"Chip"),CloudPopcorn("A4",3.65,"Chip"),
    Moonpie("B1",1.80,"Candy"), Cowtales("B2",1.50,"Candy"),
    WonkaBar("B3",1.50,"Candy"), Crunchie("B4",1.75,"Candy"),
    Cola("C1",1.25,"Drink"), DrSalt("C2",1.50,"Drink"),
    MountainMelter("C3",1.50,"Drink"),Heavy("C4",1.50,"Drink"),
    UChews("D1",0.85,"Gum"),LittleLeagueChew("D2",0.95,"Gum"),
    Chiclets("D3",0.75,"Gum"),Triplemint("D4",0.75,"Gum");

    private String id;
    private double price;
    private String type;

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    Products(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}
