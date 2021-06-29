package com.hcl.java01;

public class Exercise15 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			String toPrint = "";
			if(i%3==0) {
				toPrint += "fizz ";
			} if(i%5==0) {
				toPrint += "buzz";
			}
			if(!toPrint.equals("")) {
				System.out.println(i+": "+toPrint);
			}
		}
	}
}
