package java_practice_codingbat;

import java.util.Scanner;

//The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

public class Logic1_squirrelPlay {

	public static void main(String[] args) {
		int temp;
		boolean isSummer;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your style factor : ");
		temp = input.nextInt();
		System.out.print("Enter your dates' style factor: ");
		isSummer = input.nextBoolean();
		System.out.println(squirrelPlay(temp, isSummer));

		input.close();
	}

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		return isSummer == true ? temp >= 60 && temp <= 100 : temp >= 60 && temp <= 90;
	}

}
