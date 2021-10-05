package java_practice_codingbat;

import java.util.Scanner;

//You have a blue lottery ticket, with integers a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

public class Logic1_blueTicket {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(blueTicket(a, b, c));

		input.close();
	}

	public static int blueTicket(int a, int b, int c) {
		if (a + b == 10 || b + c == 10 || c + a == 10)
			return 10;
		if (a + b == b + c + 10 || a + b == c + a + 10)
			return 5;
		return 0;
	}
}
