package com.hackerrank.problems;

import java.util.Scanner;

public class ArraysWithScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many words would you like to enter:");
		int numWords = scan.nextInt();
		
		String dummy = scan.nextLine();
		
		String[] words = new String[numWords];
		
		System.out.println("\nEnter in " + numWords + " Words:");
		
		for (int i = 0; i < words.length; i++) {
			System.out.println("Word " + (i+1) + ": ");
			words[i] = scan.nextLine();
		}
		System.out.println("\nThe words you entered are: ");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
			
		}
	}

