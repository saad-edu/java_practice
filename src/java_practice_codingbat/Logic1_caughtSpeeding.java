package java_practice_codingbat;

import java.util.Scanner;

//You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

public class Logic1_caughtSpeeding {

	public static void main(String[] args) {
		int speed;
		boolean isBirthday;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed : ");
		speed = input.nextInt();
		System.out.print("Is it drivers' birthday(true/false) : ");
		isBirthday = input.nextBoolean();
		System.out.println(caughtSpeeding(speed, isBirthday));

		input.close();
	}

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday == false) {
			if (speed <= 60)
				return 0;
			else if (speed >= 61 && speed <= 80)
				return 1;
			else
				return 2;
		} else {
			if (speed <= 65)
				return 0;
			else if (speed >= 66 && speed <= 85)
				return 1;
			else
				return 2;
		}
	}

}
