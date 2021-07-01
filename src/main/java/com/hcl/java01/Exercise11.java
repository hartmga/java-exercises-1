package com.hcl.java01;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers separated by a space:");
		double n1 = in.nextDouble();
		double n2 = in.nextDouble();
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" * "+n2+" = "+n1*n2);
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));

	}

}
