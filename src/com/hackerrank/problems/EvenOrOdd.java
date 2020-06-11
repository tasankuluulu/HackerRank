package com.hackerrank.problems;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
		}
}
