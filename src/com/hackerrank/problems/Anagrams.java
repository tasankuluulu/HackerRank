package com.hackerrank.problems;

import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		boolean isAnagram = true;
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.length() != b.length()) {
			isAnagram = false;
			return isAnagram;
		}
		java.util.LinkedHashSet<Character> set = new java.util.LinkedHashSet<>();
		for (int i = 0; i < a.length(); i++) {
			set.add(a.charAt(i));
		}
		java.util.Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			int count1 = 0;
			int count2 = 0;
			char letter = it.next();
			for (int i = 0; i < a.length(); i++) {
				if (letter == a.charAt(i)) {
					count1++;
				}
			}
			for (int n = 0; n < b.length(); n++) {
				if (letter == b.charAt(n)) {
					count2++;
				}
			}
			if (count1 != count2) {
				isAnagram = false;
				break;
			}
		}
		return isAnagram;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		boolean isAnagram = isAnagram(a, b);
		if (isAnagram) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
		scan.close();
	}
}
