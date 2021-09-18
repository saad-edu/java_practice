package java_practice;

import java.util.Scanner;

public class MultiplyTwoFloats {

	public static void main(String[] args) {
		float a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first float: ");
		a = input.nextFloat();
		System.out.print("Enter second number: ");
		b = input.nextFloat();
		System.out.println("Product of the two floats = " + (a*b));
		
		input.close();

	}

}
