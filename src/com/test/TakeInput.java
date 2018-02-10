package com.test;

public class TakeInput {
	public static void main(String[] args) {
		// int a = 5;
		// int b = 0; // you know this won’t work
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			// try
			// {
			int c = a / b; // but you try it anyway
		} catch (ArithmeticException e) {
			System.out.println("Oops, you can’t " + "divide by zero.");
		}

		catch (NumberFormatException e) {
			System.out.println("Oops, you can’t " + "divide by zeros.");
		}

	}
}