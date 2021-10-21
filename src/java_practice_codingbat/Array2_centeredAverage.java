package java_practice_codingbat;

import java.util.Arrays;
import java.util.Scanner;

//Return the "centered" average of an array of integers, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

public class Array2_centeredAverage {

	public static void main(String[] args) {
		int[] nums;
		nums = getArray();
		System.out.println("array is " + Arrays.toString(nums));
		System.out.println(centeredAverage(nums));
		
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

	public static int centeredAverage(int[] nums) {
		  Arrays.sort(nums);
		  int sum=0;
		  for(int i=1;i<nums.length-1;i++) sum+=nums[i];
		  return sum/(nums.length-2);
		}

}
