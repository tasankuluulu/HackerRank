package com.hackerrank.problems;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			array[i] = num;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		scan.close();
	}

}

//Take 10 integer inputs from user and store them in an array and print them on screen
