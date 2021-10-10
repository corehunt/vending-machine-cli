package com.techelevator;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

// Vending Machine Command Line Interface application
public class VendingMachineCLI {

	public static void main(String[] args) {
//		File file = new File("vendingmachine.csv");
//
//			if(file.exists()){
//				try(Scanner file = new Scanner(file)){
//
//				}
//			}

		// Make some objects here!
		Scanner keyboard = new Scanner(System.in);
		ItemReader map = new ItemReader();

		TreeMap<String, Product> productsMap = ItemReader.readItems();


//		All keys from our map are passed into a list called inventory
		Inventory inventory = new Inventory(new ArrayList<>(productsMap.keySet()));
//
		UserInteraction welcomeToVendoMatic = new UserInteraction();
		welcomeToVendoMatic.mainMenu(productsMap,inventory);


		/*	Display vending machine items
		Each vending machine product has a slot identifier and a purchase price.
		Each slot in the vending machine has enough room for 5 of that product.
		Every product is initially stocked to the maximum amount.
		A product that has run out must indicate that it is SOLD OUT.
		 */








	}


}