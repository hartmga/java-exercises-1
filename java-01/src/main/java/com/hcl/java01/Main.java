package com.hcl.java01;

import java.util.Scanner;

//for exercises 16, 17, and 18
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int input = in.nextInt();

		// 16
		int result = UserMainCode.checkSum(input);
		if (result == 1) {
			System.out.println("Sum of odd digits is odd.");
		} else if (result == -1) {
			System.out.println("Sum of odd digits is even.");
		}

		// 17
		result = UserMainCode.sumOfSquaresOfEvenDigits(input);
		System.out.println("Sum of squares of even digits is " + result);

		// 18
		in.nextLine();
		System.out.println("Enter two sentences on separate lines: ");
		String sent1 = in.nextLine();
		String sent2 = in.nextLine();
		String word1 = UserMainCode.getLargestWord(sent1);
		String word2 = UserMainCode.getLargestWord(sent2);
		System.out.println("First sentence longest word: " + word1);
		System.out.println("Second sentence longest word: " + word2);

	}

}
