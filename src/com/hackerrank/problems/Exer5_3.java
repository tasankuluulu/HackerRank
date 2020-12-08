package com.hackerrank.problems;

public class Exer5_3 {
	public static void main(String[] args) {
		System.out.printf("%9s %-10s%n", "Kilograms", "Pounds");
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%-9d %-10.1f%n", i, (i * 2.2));
		}
	}

}
