package com.techelevator;

import java.util.Scanner;

// Vending Machine Command Line Interface application
public class VendingMachineCLI extends Items {

	public static void main(String[] args) {
		// Make some objects here!
		Scanner file = new Scanner(System.in);
		System.out.println("Welcome to Vendomatic 800!");
		System.out.println("");
		System.out.println("Press 1 to display vending machine items.");
		System.out.println("Press 2 to purchase.");
		System.out.println("Press 3 to exit.");
		System.out.println("");

		System.out.print("Please make your selection >>> ");
		String userInput = file.nextLine();
		/*	Display vending machine items
		Each vending machine product has a slot identifier and a purchase price.
		Each slot in the vending machine has enough room for 5 of that product.
		Every product is initially stocked to the maximum amount.
		A product that has run out must indicate that it is SOLD OUT.
		 */



		if(userInput.equals("1")){
			Items vendingItems = new Items();
			vendingItems.displayItems();
			System.out.println("Press 2 to purchase.");
			System.out.println("Press 3 to exit.");
			String itemSelection = file.nextLine();		//A1 1.00 or B3





		} else if(userInput.equals("2")) {

		}

	}
}