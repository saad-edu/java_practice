package java_practice;

import java.util.Scanner;

public class SwapNumbersUsingTemp {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.println("Numbers a,b: "+a+" "+b);
		temp = b;
		b = a;
		a = temp;
		System.out.println("Numbers a,b: "+a+" "+b);
		
		input.close();
	}

}
