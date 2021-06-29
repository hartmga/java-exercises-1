package com.hcl.java01;

import java.util.Scanner;

public class Exercise11_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers on separate lines:");
		double d1 = in.nextDouble();
		in.nextLine();
		double d2 = in.nextDouble();
		in.nextLine();
		double d3 = in.nextDouble();
		double avg = (d1+d2+d3)/3;
		System.out.println("The average of "+d1+", "+d2+", "+d3+" is "+avg);
	}
}
