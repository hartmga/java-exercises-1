package com.hcl.java01;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercise19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = JOptionPane.showInputDialog(null, "Enter a character", "ASCII Table",
				JOptionPane.QUESTION_MESSAGE);
		while (input != null && !input.equals("") && !input.equals("exit")) {
			char c = input.charAt(0);
			System.out.println(c + ": " + (byte) c);
			input = JOptionPane.showInputDialog(null, "Enter a character", "ASCII Table", JOptionPane.QUESTION_MESSAGE);
		}
	}
}
