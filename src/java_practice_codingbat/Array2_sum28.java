package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, return true if the sum of all the 2's in the array is exactly 8.

public class Array2_sum28 {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(sum28(nums));

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

	public static boolean sum28(int[] nums) {
		  int count=0;
		  for(int num: nums) if(num==2) count++;
		  return count==4;
		}

}
