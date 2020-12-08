package com.hackerrank.problems;

import java.util.Scanner;

public class KingAndQueen {

	public static int kCol;
	public static int qCol;
	public static char kRow;
	public static char qRow;
	public static boolean isTaken = false;
	public static String king;
	public static String queen;

	void checkIsTaken(int kCol, char kRow, int qCol, char qRow) {
		this.kCol = kCol;
		this.qCol = qCol;
		this.kRow = kRow;
		this.qRow = qRow;
		
		for(int i = 1; i <= 8; i++) {
			king = kRow + "" + kCol;
			queen = qRow + "" + qCol;
			if(king.equals(queen)) {
				isTaken = true;
				break;
			} else {
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sets = scan.nextInt();

		for (int n = 0; n < sets; n++) {
			king = scan.next();
			queen = scan.next();
			kCol = Character.getNumericValue(king.charAt(1));

			qCol = Character.getNumericValue(queen.charAt(1));

			kRow = king.charAt(0);
			qRow = queen.charAt(0);

			if (kCol == qCol || kRow == qRow) {
				isTaken = true;
			} else if (qCol > kCol && qRow > kRow) {
				for (int i = qCol; i >= kCol; i--) {
					if (kRow == qRow) {
						isTaken = true;
						break;
					} else {
						qRow--;
					}
				}
			} else if (qCol > kCol && qRow < kRow) {
				for (int i = qCol; i <= kCol; i++) {
					if (kRow == qRow) {
						isTaken = true;
						break;
					} else {
						qRow--;
					}
				}
			} else {
				for (int i = qCol; i <= kCol; i++) {
					if (kRow == qRow) {
						isTaken = true;
						break;
					} else {
						qRow++;
					}
				}

			}
			System.out.println(isTaken + " ");
		}

		scan.close();
	}
}
