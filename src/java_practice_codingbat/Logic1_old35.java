package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator 

public class Logic1_old35 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.println(old35(n));

		input.close();
	}

	public static boolean old35(int n) {
		return (n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0);
	}

}
