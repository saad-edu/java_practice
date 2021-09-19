package java_practice_codingbat;

import java.util.Scanner;

public class MonkeyTrouble_warmup1 {

	public static void main(String[] args) {
		boolean aSmile, bSmile;
		Scanner input = new Scanner(System.in);
		System.out.print("Monkey a smiling? (true/false): ");
		aSmile = input.nextBoolean();
		System.out.print("Monkey b smiling? (true/false): ");
		bSmile = input.nextBoolean();
		System.out.println(monkeyTrouble(aSmile, bSmile));

		input.close();
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false))
			return true;
		else
			return false;
	}
}
