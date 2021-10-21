package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, return true if the array contains no 1's and no 3's.

public class Array2_lucky13 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(lucky13(nums));

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

	public static boolean lucky13(int[] nums) {
		for (int num : nums) {
			if (num == 1 || num == 3)
				return false;
		}
		return true;
	}

}
