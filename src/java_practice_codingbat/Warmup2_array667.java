package java_practice_codingbat;

import java.util.Scanner;

//Given an array of integers, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

public class Warmup2_array667 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(array667(nums));

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

	public static int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
				count++;
		return count;
	}

}
