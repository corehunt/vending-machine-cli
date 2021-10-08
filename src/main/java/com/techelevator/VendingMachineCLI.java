package com.techelevator;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
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

		TreeMap<String, Product> productsMap = ItemReader.readItems();
		Inventory inventory = new Inventory(new ArrayList<>(productsMap.keySet()));
		UserInteraction welcomeToVendoMatic = new UserInteraction();
		welcomeToVendoMatic.mainMenu(productsMap);



		/*	Display vending machine items
		Each vending machine product has a slot identifier and a purchase price.
		Each slot in the vending machine has enough room for 5 of that product.
		Every product is initially stocked to the maximum amount.
		A product that has run out must indicate that it is SOLD OUT.
		 */








	}


}