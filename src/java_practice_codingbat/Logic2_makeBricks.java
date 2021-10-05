package java_practice_codingbat;

import java.util.Scanner;

//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

public class Logic2_makeBricks {

	public static void main(String[] args) {
		int small, big, goal;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of small bricks : ");
		small = input.nextInt();
		System.out.print("Enter number of big bricks : ");
		big = input.nextInt();
		System.out.print("Enter goal : ");
		goal = input.nextInt();
		System.out.println(makeBricks(small, big, goal));

		input.close();
	}

	public static boolean makeBricks(int small, int big, int goal) {
		if (goal % 5 <= small && (big * 5) + small >= goal)
			return true;
		return false;
	}

}
