package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

public class Logic1_inOrderEqual {

	public static void main(String[] args) {
		int a, b, c;
		boolean equalOk;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.print("Enter equalOk : ");
		equalOk = input.nextBoolean();
		System.out.println(inOrderEqual(a, b, c, equalOk));

		input.close();
	}

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		return equalOk == true ? c >= b && b >= a : b > a && c > b;
	}

}
