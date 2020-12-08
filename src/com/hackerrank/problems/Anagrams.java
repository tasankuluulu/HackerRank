package com.hackerrank.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		boolean isAnagram = true;
		a = a.toLowerCase();
		b = b.toLowerCase();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < a.length(); i++) {
			set.add(a.charAt(i));
		}
		Iterator<Character> it = set.iterator();
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
