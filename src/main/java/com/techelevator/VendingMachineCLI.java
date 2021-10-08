package com.techelevator;

import java.util.Scanner;

// Vending Machine Command Line Interface application
public class VendingMachineCLI {

	public static void main(String[] args) {
		// Make some objects here!
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Vendomatic 800!");
		System.out.println("");
		System.out.println("Press 1 to display vending machine items.");
		System.out.println("Press 2 to purchase.");
		System.out.println("Press 3 to exit.");
		System.out.println("");

		System.out.print("Please make your selection >>> ");
		String userInput = keyboard.nextLine();
		/*	Display vending machine items
		Each vending machine product has a slot identifier and a purchase price.
		Each slot in the vending machine has enough room for 5 of that product.
		Every product is initially stocked to the maximum amount.
		A product that has run out must indicate that it is SOLD OUT.
		 */



		if(userInput.equals("1")){
			Items vendingItems = new Items();
			vendingItems.displayItems();

			System.out.println("");
			System.out.println("Press 2 to purchase.");
			System.out.println("Press 3 to exit.");
			String itemSelection = keyboard.nextLine();		//A1 1.00 or B3





		} else if(userInput.equals("2")) {
			System.out.println("Please a whole dollar amount of 1, 5, or 10.");
			boolean feedMoreMoney = true;
			while (feedMoreMoney){
				String input = keyboard.nextLine();
				Double cashInput = Double.parseDouble(input);
				System.out.println("Would you like to add more money? Y/N");
				String moreMoney = keyboard.nextLine();
				if(moreMoney.equals("Y")){
					System.out.println("Please a whole dollar amount of 1, 5, or 10.");


				}

			}else if(feedMoreMoney){

		}

	}
}