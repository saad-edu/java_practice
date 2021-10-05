package java_practice_codingbat;

import java.util.Scanner;

//We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator.

public class Logic1_specialEleven {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.println(specialEleven(n));

		input.close();
	}

	public static boolean specialEleven(int n) {
		return n % 11 == 0 || (n - 1) % 11 == 0;
	}

}
