package java_practice_codingbat;

import java.util.Scanner;

//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

public class StartOz_warmup1 {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		str = input.nextLine();
		System.out.println(startOz(str));

		input.close();
	}

	public static String startOz(String str) {
		if (str.length() >= 2 && str.substring(0, 2).equals("oz"))
			return "oz";
		else if (str.length() >= 2 && str.charAt(1) == 'z')
			return "z";
		else if (str.length() >= 1 && str.charAt(0) == 'o')
			return "o";
		else
			return "";
	}

}
