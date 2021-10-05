package java_practice_codingbat;

import java.util.Scanner;

//Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.

public class Logic1_answerCell {

	public static void main(String[] args) {
		boolean isMorning, isMom, isAsleep;
		Scanner input = new Scanner(System.in);
		System.out.print("isMorning? : ");
		isMorning = input.nextBoolean();
		System.out.print("isMom? : ");
		isMom = input.nextBoolean();
		System.out.print("isAsleep : ");
		isAsleep = input.nextBoolean();
		System.out.println(answerCell(isMorning, isMom, isAsleep));

		input.close();
	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep)
			return false;
		if ((isMorning && isMom) || !isMorning)
			return true;
		else
			return false;
	}

}
