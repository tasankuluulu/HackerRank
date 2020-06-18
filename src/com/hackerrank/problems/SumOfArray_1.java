package com.hackerrank.problems;

import java.util.Scanner;

public class SumOfArray_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int numOfInt = scan.nextInt();
		int[] array = new int[numOfInt];
		int result = 0;
		
		for (int i = 0; i < numOfInt; i++) {
			array[i] = scan.nextInt();
			result += array[i];
		}
		System.out.println(result);
	}

}
