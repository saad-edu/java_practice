package java_practice_codingbat;

import java.util.Scanner;

//You have a green lottery ticket, with integers a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

public class Logic1_greenTicket {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(greenTicket(a, b, c));

		input.close();
	}

	public static int greenTicket(int a, int b, int c) {
		if (a == b && b == c)
			return 20;
		if (a == b || b == c || c == a)
			return 10;
		return 0;
	}

}
