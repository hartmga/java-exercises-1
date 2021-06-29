package com.hcl.java01;

public class Exercise9 {
	public static void main(String[] args) {
		System.out.println("Arguments entered: ");
		for (int i = 0; i < args.length; i++) {
			System.out.println("\t" + args[i]);
		}

		// add arguments if they are all numbers
		try {
			double sum = 0;
			for (int i = 0; i < args.length; i++) {
				double next = Double.parseDouble(args[i]);
				sum += next;
			}
			System.out.println("The sum of all arguments is " + sum);
		} catch (NumberFormatException e) {
			System.out.println("Not all arguments were numbers.");
		}
	}
}
