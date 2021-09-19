package java_practice_codingbat;

import java.util.Scanner;

//Given an integer n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

public class NearHundred_warmup1 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		n = input.nextInt();
		System.out.println(nearHundred(n));

		input.close();
	}

	public static boolean nearHundred(int n) {
		if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10)
			return true;
		else
			return false;
	}

}
