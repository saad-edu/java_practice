package java_practice_codingbat;

import java.util.Scanner;

//Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2

public class Logic1_nearTen {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = input.nextInt();
		System.out.println(nearTen(n));

		input.close();
	}

	public static boolean nearTen(int num) {
		return num % 10 <= 2 || num % 10 >= 8;
	}

}
