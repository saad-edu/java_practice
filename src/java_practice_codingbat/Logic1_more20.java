package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 

public class Logic1_more20 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.println(more20(n));

		input.close();
	}

	public static boolean more20(int n) {
		return (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
	}

}
