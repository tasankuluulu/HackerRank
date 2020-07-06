package com.hackerrank.problems;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();

		System.out.printf("What is the price of %s?%n", item);
		double price = scan.nextDouble();

		double money = 0;
		double remainder = price;
		boolean askMoney = true;

		while (askMoney) {

			if (price > 0) {

				if (remainder > 0) {
					System.out.printf("You need to pay $%.2f. Please enter cash%n", remainder);
					money = scan.nextDouble();
					remainder -= money;
				} else if (remainder == 0) {
					break;
				} else {
					System.out.printf("Please take a change $%.2f%n", Math.abs(remainder));
					break;
				}
			} else if (price == 0) {
				System.err.println("Item cann't be free. Please enter the correct price!");
			} else {
				System.err.println("Price can't be negative. Please enter the correct price!");
				break;
			}
		}
		System.out.println("Thank you for shopping!");
		scan.close();
	}

}

//Write a program to ask a user to enter item they want to buy 
//and the price of that item. Every time user enters money accumulate the amount 
//and tell the user how much is left to pay off. If user give more money program should return a change.
//Whenever a user done with payments program should say "Thank you for shopping!"