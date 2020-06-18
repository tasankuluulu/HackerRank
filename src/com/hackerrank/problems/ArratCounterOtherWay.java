package com.hackerrank.problems;

import java.util.Scanner;

public class ArratCounterOtherWay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int x;
		int counterList[] = new int[n];

		for (int i = 0; i < m; i++) {
			x = in.nextInt();
			counterList[(x - 1)] += 1;
		}
		for (int i : counterList) {
			System.out.print(i + " ");
		}
		in.close();
	}
}
