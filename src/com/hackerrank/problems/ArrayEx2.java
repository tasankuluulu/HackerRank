package com.hackerrank.problems;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number do you want to enter?");
		int quaOfNum = scan.nextInt();

		System.out.println("Please enter numbers");
		int[] array = new int[quaOfNum];

		for (int i = 0; i < quaOfNum; i++) {
			int num = scan.nextInt();
			array[i] = num;
		}
		System.out.println("Which number do you want me to check?");
		int numToCheck = scan.nextInt();
		String result = null;
		for (int i = 0; i < array.length; i++) {
			if (numToCheck == array[i]) {
				result = "";
				break;
			} else {
				result = "not ";
			}
		}
		System.out.printf("%d is %spresented in the array", numToCheck, result);
		scan.close();
	}

}

//Take 10 integer inputs from user and store them in an array. 
//Again ask user to give a number. 
//Now, tell user whether that number is present in array or not.
