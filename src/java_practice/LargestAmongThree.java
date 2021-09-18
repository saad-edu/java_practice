package java_practice;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		int a,b,c,largest;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = input.nextInt();
		System.out.print("Enter second number: ");
		b = input.nextInt();
		System.out.print("Enter third number: ");
		c = input.nextInt();
		largest = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);
		System.out.println("largest number = " + largest);
		
		input.close();
	}

}
