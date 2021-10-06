package java_practice_codingbat;

import java.util.Scanner;

//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

public class String2_mixString {

	public static void main(String[] args) {
		String a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string a: ");
		a = input.nextLine();
		System.out.print("Enter string b: ");
		b = input.nextLine();
		System.out.println(mixString(a, b));

		input.close();
	}

	public static String mixString(String a, String b) {
		  int aLen = a.length(), bLen = b.length();
		  String c = "", temp = "";
		  if(aLen <= bLen) temp = b.substring(aLen,bLen);
		  else temp = a.substring(bLen,aLen);
		  for(int i=0;i<Math.min(aLen,bLen);i++) 
		    c+= a.substring(i,i+1) + b.substring(i,i+1);
		  return c+=temp;
		}
}

//	Other method:
//		public String mixString(String a, String b) {
//		  int aLen = a.length();
//		  int bLen = b.length();
//		  int max = Math.max(aLen, bLen);
//		  String word = "";
//		  for (int i = 0; i < max; i++) {
//		    if (i <= aLen-1)
//		      word += a.substring(i,i+1);
//		    if (i <= bLen-1)
//		      word += b.substring(i,i+1);
//		  }
//		  return word;
//		}
