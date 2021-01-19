package com.hackerrank.problems;

import java.util.Scanner;

public class NumberLineJumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if(v2 >= v1) {
			return "NO";
		}
		if ((x2 - x1) % (v1 - v2) == 0) {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		String answer = kangaroo(0, 2, 5, 3);
		System.out.println(answer);
	}
}
