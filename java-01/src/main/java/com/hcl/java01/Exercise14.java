package com.hcl.java01;

import java.util.Scanner;

public class Exercise14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a character:");
		char input = in.nextLine().charAt(0);
		System.out.println((byte) input);
	}
}
