package java_practice_codingbat;

import java.util.Scanner;

//When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.

public class Logic1_cigarParty {

	public static void main(String[] args) {
		int cigars;
		boolean isWeekend;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of cigars: ");
		cigars = input.nextInt();
		System.out.print("Is the party on weekend (true/false): ");
		isWeekend = input.nextBoolean();
		System.out.println(cigarParty(cigars, isWeekend));
		
		input.close();
	}
	
	
	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend == true && cigars >= 40)
			return true;
		else if (isWeekend == false && cigars >= 40 && cigars <= 60)
			return true;
		else
			return false;
	}

}
