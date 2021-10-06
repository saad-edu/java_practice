package java_practice_codingbat;

import java.util.Scanner;

//We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

public class String2_xyBalance {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(xyBalance(str));

		input.close();
	}

	public static boolean xyBalance(String str) {
		if (!str.contains("x"))
			return true;
		if (str.endsWith("x"))
			return false;
		else {
			int lastX = str.lastIndexOf("x");
			return str.substring(lastX, str.length()).contains("y");
		}
	}
	
//	Other approach:
//	public boolean xyBalance(String str) {
//		int x = str.lastIndexOf('x');
//		int y = str.lastIndexOf('y');
//		return (x > y) ? false : true;
//	}

}
