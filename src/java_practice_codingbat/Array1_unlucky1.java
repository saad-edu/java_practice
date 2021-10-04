package java_practice_codingbat;

import java.util.Scanner;

//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

public class Array1_unlucky1 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(unlucky1(nums));

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

	public static boolean unlucky1(int[] nums) {
		return nums.length >= 2 && ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)
				|| (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3));
	}

}
