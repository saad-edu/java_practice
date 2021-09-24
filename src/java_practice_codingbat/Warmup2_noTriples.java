package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

public class Warmup2_noTriples {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(noTriples(nums));

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

	public static boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++)
			if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2] && nums[i + 2] == nums[i])
				return false;
		return true;
	}

}
