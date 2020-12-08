package com.hackerrank.problems;

public class Exer5_5 {
	public static void main(String[] args) {
		System.out.printf("%10s %10s %10s %-10s %-10s%n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
		int pounds = 20;
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%10d %10.1f %10s %-10d %-10.1f%n", i, i * 2.2, "|", pounds, pounds / 2.2);
			pounds += 5;
		}
	}
}
