package java_practice;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println("Sum of the two numbers = " + (a+b));
		
		input.close();
	}

}
