package java_practice_codingbat;

import java.util.Scanner;

//Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.

public class Logic1_withoutDoubles {

	public static void main(String[] args) {
		int die1, die2;
		boolean noDoubles;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter die1 : ");
		die1 = input.nextInt();
		System.out.print("Enter die2 : ");
		die2 = input.nextInt();
		System.out.print("Enter noDoubles : ");
		noDoubles = input.nextBoolean();
		System.out.println(withoutDoubles(die1, die2, noDoubles));

		input.close();
	}

	public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (die1 == die2 && die1 == 6 && noDoubles == true)
			return die1 + 1;
		if (die1 == die2 && noDoubles == true)
			return die1 + die2 + 1;
		else
			return die1 + die2;
	}

}
