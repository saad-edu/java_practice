package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an integer array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

public class Array1_fix23 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(fix23(nums)));

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

	public static int[] fix23(int[] nums) {
		if (nums.length < 2)
			return nums;
		else {
			for (int i = 0; i < nums.length - 1; i++)
				if (nums[i] == 2 && nums[i + 1] == 3)
					nums[i + 1] = 0;
			return nums;
		}
	}
}
