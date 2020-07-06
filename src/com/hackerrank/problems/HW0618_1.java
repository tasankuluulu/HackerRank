package com.hackerrank.problems;

public class HW0618_1 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
