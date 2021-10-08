package com.techelevator;

public class Product {

    private final String id;
    private final String name;
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

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        String output = id +" "+ name +" " + price +" " + type;

        return output;
    }
    Product(String id, String name, double price, String type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;


    }
}
