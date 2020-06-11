package com.hackerrank.problems;
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		System.out.println("Enter N number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n * i);		
		}
	}
}
