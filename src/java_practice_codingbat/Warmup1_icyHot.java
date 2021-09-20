package java_practice_codingbat;

import java.util.Scanner;

//Given two temperatures, return true if one is less than 0 and the other is greater than 100.

public class Warmup1_icyHot {

	public static void main(String[] args) {
		int temp1, temp2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter temp1: ");
		temp1 = input.nextInt();
		System.out.print("Enter temp2: ");
		temp2 = input.nextInt();
		System.out.println(icyHot(temp1, temp2));

		input.close();
	}

	public static boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0)
			return true;
		else
			return false;
	}

}
