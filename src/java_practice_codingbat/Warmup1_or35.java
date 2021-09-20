package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator

public class Warmup1_or35 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		n = input.nextInt();
		System.out.println(or35(n));

		input.close();
	}

	public static boolean or35(int n) {
		if (n % 3 == 0 || n % 5 == 0)
			return true;
		else
			return false;
	}
}
