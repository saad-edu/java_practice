package java_practice_codingbat;

import java.util.Scanner;

//You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).

public class Logic1_dateFashion {

	public static void main(String[] args) {
		int you, date;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your style factor : ");
		you = input.nextInt();
		System.out.print("Enter your dates' style factor: ");
		date = input.nextInt();
		System.out.println(dateFashion(you, date));

		input.close();
	}

	public static int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2)
			return 0;
		else if (you >= 8 || date >= 8)
			return 2;
		else
			return 1;
	}

}
