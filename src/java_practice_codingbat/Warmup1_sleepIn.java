package java_practice_codingbat;

import java.util.Scanner;

//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public class Warmup1_sleepIn {

	public static void main(String[] args) {
		boolean weekday;
		boolean vacation = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Is it a weekday? (true/false): ");
		weekday = input.nextBoolean();
		System.out.print("Is it a vacation? (true/false): ");
		vacation = input.nextBoolean();
		System.out.println(sleepIn(weekday, vacation));

		input.close();
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday == false || vacation == true)
			return true;
		else
			return false;
	}
}
