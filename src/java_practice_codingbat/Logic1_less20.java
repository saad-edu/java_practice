package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false

public class Logic1_less20 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.println(less20(n));

		input.close();
	}

	public static boolean less20(int n) {
		return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
	}

}
