package java_practice_codingbat;

import java.util.Scanner;

//You have a red lottery ticket showing integers a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.

public class Logic1_redTicket {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(redTicket(a, b, c));

		input.close();
	}

	public static int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;
		if (a == b && b == c)
			return 5;
		if (b != a && c != a)
			return 1;
		return 0;
	}

}
