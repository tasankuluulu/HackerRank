package com.hackerrank.problems;

import java.util.Scanner;

public class HW2_v2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to buy?");
		String item = scan.nextLine();

		System.out.printf("What is the price of %s?%n", item);
		boolean askPrice = true;

		while (askPrice) {

			try {
				double price = scan.nextDouble();
				double remainder = price;

				while (remainder > 0) {
					System.out.printf("You need to pay $%.2f. Please enter cash.%n", remainder);
					double money = scan.nextDouble();
					remainder -= money;
				}

				if (remainder < 0) {
					System.out.printf("Please take your change $%.2f%n", Math.abs(remainder));
					break;
				}

			} catch (Exception e) {
				System.err.printf("Invalid input. Please enter the price of %s.%n", item);
				String str = scan.nextLine();
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