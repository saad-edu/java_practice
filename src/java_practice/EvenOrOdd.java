package java_practice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int a;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a = input.nextInt();
		result = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println("Number is " + result);
		
		input.close();
	}

}
