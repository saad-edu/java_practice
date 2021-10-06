package java_practice_codingbat;

import java.util.Scanner;

//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

public class String2_zipZap {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(zipZap(str));

		input.close();
	}

	public static String zipZap(String str) {
		return str.replaceAll("z\\wp", "zp");
	}

}

//Other methods:
//	public String zipZap(String str) {
//	for (int i=0; i<str.length()-2; i++){
//	if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
//	str = str.substring(0, i+1) + str.substring(i+2);
//	}
//	}
//	return str;
//	}
//
//	public String zipZap(String str) {
//		return str.replaceAll("z.p", "zp");
//	}

