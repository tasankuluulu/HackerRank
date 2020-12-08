package com.hackerrank.problems;

import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BlackjackCounting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < num; i++) {
			String[] cards = scan.nextLine().split(" ");
			int count = 0;
			int ACount = 0;
			for (String card : cards) {
				switch (card) {
				case "2":
					count += 2;
					break;
				case "3":
					count += 3;
					break;
				case "4":
					count += 4;
					break;
				case "5":
					count += 5;
					break;
				case "6":
					count += 6;
					break;
				case "7":
					count += 7;
					break;
				case "8":
					count += 8;
					break;
				case "9":
					count += 9;
					break;
				case "T":
					count += 10;
					break;
				case "J":
					count += 10;
					break;
				case "Q":
					count += 10;
					break;
				case "K":
					count += 10;
					break;
				case "A":
					ACount++;
					break;
				}
			}
			int AUsedTime = 0;
			for (int j = 0; j < ACount; j++) {

				if (21 - count >= 11) {
					count += 11;
					AUsedTime++;
				} else {
					count++;
				}

			}
			if (AUsedTime > 0 && count > 21) {
				count = count - (AUsedTime * 11) + AUsedTime;
			}

			if (count > 21) {
				System.out.print("Bust ");
			} else {
				System.out.print(count + " ");
			}
		}
	}

}
