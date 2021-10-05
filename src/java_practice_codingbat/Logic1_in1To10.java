package java_practice_codingbat;

import java.util.Scanner;

//Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.

public class Logic1_in1To10 {

	public static void main(String[] args) {
		int n;
		boolean outsideMode;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.print("outsideMode? (true/false) : ");
		outsideMode = input.nextBoolean();
		System.out.println(in1To10(n, outsideMode));

		input.close();
	}

	public static boolean in1To10(int n, boolean outsideMode) {
		return outsideMode == true ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10);
	}

}
