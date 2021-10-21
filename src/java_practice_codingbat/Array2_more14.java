package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, return true if the number of 1's is greater than the number of 4's

public class Array2_more14 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(more14(nums));

	}

	public static int[] getArray() {
		int arraySize;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		arraySize = input.nextInt();
		int[] nums = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			System.out.print("Enter array element " + (i + 1) + ": ");
			nums[i] = input.nextInt();
		}

		input.close();
		return nums;

	}

	public static boolean more14(int[] nums) {
		  int ones=0, fours=0;
		  for(int num: nums){
		    if(num==1) ones++;
		    if(num==4) fours++;
		  }
		  return ones>fours;
		}


}
