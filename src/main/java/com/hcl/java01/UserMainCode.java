package com.hcl.java01;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//for exercises 16, 17, and 18
public class UserMainCode {

	// for exercise 16
	public static int checkSum(int n) {
		String digits = Integer.toString(n);
		boolean parity = false; // if parity is true, the sum is odd
		for (int i = 0; i < digits.length(); i++) {
			int digit = Integer.parseInt(digits.substring(i, i + 1));
			if (digit % 2 != 0) {
				parity = !parity;
			}
		}
		return parity ? 1 : -1;
	}

	// for exercise 17
	public static int sumOfSquaresOfEvenDigits(int n) {
		String digits = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < digits.length(); i++) {
			int digit = Integer.parseInt(digits.substring(i, i + 1));
			if (digit % 2 == 0) {
				sum += digit * digit;
			}
		}
		return sum;
	}

	// for exercise 18
	public static String getLargestWord(String sent) {
		String[] words = sent.split("\\W+");
		String longest = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		return longest;
	}

}
