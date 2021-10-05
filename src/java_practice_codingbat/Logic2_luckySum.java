package java_practice_codingbat;

import java.util.Scanner;

//Given 3 integer values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

public class Logic2_luckySum {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(luckySum(a, b, c));

		input.close();
	}

	public static int luckySum(int a, int b, int c) {
		if (a == 13)
			return 0;
		if (b == 13)
			return a;
		if (c == 13)
			return a + b;
		return a + b + c;
	}

}
