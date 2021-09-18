package java_practice;

import java.util.Scanner;

public class ComputeQuotientRemainder {
	public static void main(String[] args) {	
	int a,b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter dividend: ");
		a = input.nextInt();
		System.out.print("Enter divisor: ");
		b = input.nextInt();
		System.out.println("Quotient = " + (a/b));
		System.out.println("Remainder = " + (a%b));
		
		input.close();
	}
}
