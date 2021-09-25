package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

public class String1_theEnd {

	public static void main(String[] args) {
		String str;
		boolean front;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.print("Enter front(true/false): ");
		front = input.nextBoolean();
		System.out.println(theEnd(str, front));

		input.close();
	}

	public static String theEnd(String str, boolean front) {
		if (front == true)
			return str.substring(0, 1);
		else
			return str.substring(str.length() - 1, str.length());
	}

}
