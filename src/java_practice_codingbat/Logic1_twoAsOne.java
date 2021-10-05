package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if it is possible to add two of the ints to get the third.

public class Logic1_twoAsOne {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(twoAsOne(a, b, c));

		input.close();
	}

	public static boolean twoAsOne(int a, int b, int c) {
		return a + b == c || b + c == a || c + a == b;
	}

}
