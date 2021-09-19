package java_practice_codingbat;

import java.util.Scanner;

//We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public class ParrotTrouble_warmup1 {

	public static void main(String[] args) {
		boolean talking;
		int hour;
		Scanner input = new Scanner(System.in);
		System.out.print("Parrot talking? (true/false): ");
		talking = input.nextBoolean();
		System.out.print("Enter current hour time in the range 0..23: ");
		hour = input.nextInt();
		System.out.println(parrotTrouble(talking, hour));

		input.close();
	}

	public static boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true && (hour < 7 || hour > 20))
			return true;
		else
			return false;
	}
}
