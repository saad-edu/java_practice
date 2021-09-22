package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

public class Warmup2_arrayFront9 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(arrayFront9(nums));

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

	public static boolean arrayFront9(int[] nums) {
		int arrayLen = nums.length;
		if (arrayLen < 4) {
			for (int num : nums) {
				if (num == 9) return true;
			}
			return false;
		} else {
			for (int i = 0; i < arrayLen - 1; i++) {
				if (nums[i] == 9) return true;
			}
			return false;
		}
	}
}
