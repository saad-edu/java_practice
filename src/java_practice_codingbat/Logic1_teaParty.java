package java_practice_codingbat;

import java.util.Scanner;

//We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

public class Logic1_teaParty {

	public static void main(String[] args) {
		int tea, candy;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your style factor : ");
		tea = input.nextInt();
		System.out.print("Enter your dates' style factor: ");
		candy = input.nextInt();
		System.out.println(teaParty(tea, candy));

		input.close();
	}

	public static int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		else if (tea / candy >= 2 || candy / tea >= 2)
			return 2;
		else
			return 1;
	}

}
