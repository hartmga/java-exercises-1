package com.hcl.java01;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = in.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		System.out.println(num + " is " + (isPrime ? "" : "not ") + "prime");
	}
}
