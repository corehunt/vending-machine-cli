package com.techelevator;

public enum Candy {

    Moonpie("B1",1.80,"Candy"), Cowtales("B2",1.50,"Candy"),
    WonkaBar("B3",1.50,"Candy"), Crunchie("B4",1.75,"Candy");

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

    Candy(String id, double price, String type){
        this.id = id;
        this.price = price;
        this.type = type;


    }
}

