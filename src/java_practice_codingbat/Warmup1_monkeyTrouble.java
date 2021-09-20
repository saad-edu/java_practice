package java_practice_codingbat;

import java.util.Scanner;

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

public class Warmup1_monkeyTrouble {

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
