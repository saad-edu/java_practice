package java_practice_codingbat;

import java.util.Scanner;

//Given 2 integers, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public class Logic1_sortaSum {

	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.println(sortaSum(a, b));

		input.close();
	}

	public static int sortaSum(int a, int b) {
		int sum = a + b;
		return sum < 10 || sum > 19 ? sum : 20;
	}

}
