package com.hcl.java01;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char c = input.charAt(0);
		switch (c) {
		default:
			System.out.println("Your input did not start with 'a', '1', or '@'.");
			break;
		case 'a':
			System.out.println("Your input started with 'a'.");
			break;
		case '1':
			System.out.println("Your input started with '1'.");
			break;
		case '@':
			System.out.println("Your input started with '@'.");
			break;

		}
	}
}
