package java_practice_codingbat;

import java.util.Scanner;

//We want make a package of goal kilo's of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

public class Logic2_makeChocolate {

	public static void main(String[] args) {
		int small, big, goal;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of small bars : ");
		small = input.nextInt();
		System.out.print("Enter number of big bars : ");
		big = input.nextInt();
		System.out.print("Enter goal : ");
		goal = input.nextInt();
		System.out.println(makeChocolate(small, big, goal));

		input.close();
	}

	public static int makeChocolate(int small, int big, int goal) {
		if (small + big * 5 >= goal && goal % 5 <= small)
			return big * 5 >= goal ? goal % 5 : goal - big * 5;
		return -1;
	}

}
