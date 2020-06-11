package com.hackerrank.problems;
import java.util.Scanner;

public class Loops2 {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < q; i++) {
			int a = sc1.nextInt();
			int b = sc1.nextInt();
			int n = sc1.nextInt();
			int sum = 0;
			for (int x = 0; x < n; x++) {
				int y = (int) Math.pow(2, x);
				sum = sum + y * b;
				System.out.print(a + sum + " ");
			}
		}
		sc.close();
		sc1.close();
	}
}
