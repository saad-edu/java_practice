package java_practice_codingbat;

import java.util.Scanner;

//For this problem, we'll round an integer value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().

public class Logic2_roundSum {

	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.println(roundSum(a, b, c));

		input.close();
	}

	public static int roundSum(int a, int b, int c) {
		return round10(a) + round10(b) + round10(c);
	}

	public static int round10(int num) {
		return num % 10 >= 5 ? ((num / 10) + 1) * 10 : (num / 10) * 10;
	}
}
