package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

public class Array1_frontPiece {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(frontPiece(nums)));

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

	public static int[] frontPiece(int[] nums) {
		return (nums.length >= 2) ? new int[] { nums[0], nums[1] } : nums;
	}
}
