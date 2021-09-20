package java_practice_codingbat;

import java.util.Scanner;

//Given three integer values, a b c, return the largest.

public class IntMax_warmup1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.print("Enter c: ");
		c = input.nextInt();
		System.out.println(intMax(a, b, c));

		input.close();
	}

	public static int intMax(int a, int b, int c) {
		return a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
	}

}
