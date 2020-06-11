package com.hackerrank.problems;
import java.util.*;

public class IntToString {
	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String str = String.valueOf(num);
		System.out.println(str + 99);
		scanner.close();
	}
}
