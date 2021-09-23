package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

public class Warmup2_array123 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(array123(nums));

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

	public static boolean array123(int[] nums) {
		  for(int i=0; i < nums.length-2; i++) {
		    if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) return true;
		  }
		  return false;
		}
}
