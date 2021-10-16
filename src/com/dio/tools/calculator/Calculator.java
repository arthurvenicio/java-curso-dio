package com.dio.tools.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float a, b;
		System.out.print("Please insert the first number: ");
		a = input.nextFloat();
		System.out.print("Please insert the second number: ");
		b = input.nextFloat();
		
		float sum = sum(a, b);
		float subtraction = subtraction(a, b);
		float multiplication = multiplication(a, b);
		float division = division(a, b);
		
		System.out.println();
		System.out.println("The result of number's sum is: " + sum);
		System.out.println("The result of number's subtraction is: " + subtraction);
		System.out.println("The result of number's multiplication is: " + multiplication);
		System.out.println("The result of number's division is: " + division);
		
		input.close();
	}
	
	public static float sum(float a, float b) {
		return a + b;
	}
	
	public static float subtraction(float a, float b) {
		return a - b;
	}
	
	public static float multiplication(float a, float b) {
		return a * b;
	}
	
	public static float division(float a, float b) {
		return a / b;
	}
	
}
