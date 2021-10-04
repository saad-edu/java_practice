package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

public class Array1_reverse3 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println(Arrays.toString(reverse3(nums)));

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

	public static int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };
	}
}
