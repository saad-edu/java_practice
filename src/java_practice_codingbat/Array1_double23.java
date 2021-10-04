package java_practice_codingbat;

import java.util.Scanner;

//Given an integer array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

public class Array1_double23 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(double23(nums));

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

	public static boolean double23(int[] nums) {
		return nums.length == 2 && (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3);
	}

}
