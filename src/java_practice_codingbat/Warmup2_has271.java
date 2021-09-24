package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

public class Warmup2_has271 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(has271(nums));

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

	public static boolean has271(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++)
			if (nums[i + 1] == nums[i] + 5 && Math.abs((nums[i] - 1) - nums[i + 2]) <= 2)
				return true;
		return false;
	}

}
