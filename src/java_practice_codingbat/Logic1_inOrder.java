package java_practice_codingbat;

import java.util.Scanner;

//Given three integers, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.

public class Logic1_inOrder {

	public static void main(String[] args) {
		int a, b, c;
		boolean bOk;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		a = input.nextInt();
		System.out.print("Enter b : ");
		b = input.nextInt();
		System.out.print("Enter c : ");
		c = input.nextInt();
		System.out.print("Enter bOk : ");
		bOk = input.nextBoolean();
		System.out.println(inOrder(a, b, c, bOk));

		input.close();
	}

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		return bOk == true ? c > b : b > a && c > b;
	}

}
