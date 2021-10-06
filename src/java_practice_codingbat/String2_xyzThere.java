package java_practice_codingbat;

import java.util.Scanner;

//Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

public class String2_xyzThere {

	public static void main(String[] args) {
		String str;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string: ");
		str = input.nextLine();
		System.out.println(xyzThere(str));

		input.close();
	}

	public static boolean xyzThere(String str) {
		  boolean temp = false;
		  if(str.length()<3) return false;
		  if(str.startsWith("xyz")) return true;
		  else {
		    for(int i=1; i<str.length()-2;i++) {
		      if(str.substring(i,i+3).equals("xyz") && str.charAt(i-1) != '.') {
		        temp = true;
		        break;
		      }
		    }
		    return temp;
		  }
		}
}
